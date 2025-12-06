import streamlit as st
import qrcode
from PIL import Image, ImageDraw, ImageFont
from gtts import gTTS
from io import BytesIO
import base64

# Title of the app
st.title("Multi-functional Text Converter")
st.markdown("""
This application allows you to:
- Generate *QR Codes* from text.
- Convert text into *Audio* in various languages.
- Create *Images* with the entered text.
- Download the generated *QR Code, **Audio, and **Images*.
""")

# Text Input
st.subheader("Enter Your Text Below")
text_input = st.text_area("Input Text:")

# Language Selection
st.subheader("Select Language for Audio Conversion")
language = st.selectbox("Language", ["English (en)", "French (fr)", "German (de)", "Spanish (es)", "Italian (it)"], index=0)
language_code = language.split("(")[-1][:-1]  # Extract language code

# Helper Function: Convert Text to Audio
def text_to_speech(text, lang='en'):
    tts = gTTS(text=text, lang=lang)
    fp = BytesIO()
    tts.write_to_fp(fp)
    fp.seek(0)  # Reset buffer pointer
    return fp

# Helper Function: Generate QR Code
def generate_qr_code(data):
    qr = qrcode.QRCode(
        version=1,
        error_correction=qrcode.constants.ERROR_CORRECT_L,
        box_size=10,
        border=4,
    )
    qr.add_data(data)
    qr.make(fit=True)
    img = qr.make_image(fill_color="black", back_color="white")
    return img

# Helper Function: Create Image with Text
def create_image_with_text(text):
    img = Image.new('RGB', (800, 600), color='white')
    draw = ImageDraw.Draw(img)
    try:
        # Replace with your font file path or fallback to default
        font = ImageFont.truetype("arial.ttf", size=36)
    except IOError:
        font = ImageFont.load_default()

    # Use textbbox() to get the bounding box of the text (new method)
    text_bbox = draw.textbbox((0, 0), text, font=font)
    text_width = text_bbox[2] - text_bbox[0]
    text_height = text_bbox[3] - text_bbox[1]

    text_x = (img.width - text_width) // 2
    text_y = (img.height - text_height) // 2
    draw.text((text_x, text_y), text, fill='black', font=font)
    return img


# Helper Function: Convert Image to Base64 for Download
def convert_image_to_downloadable(img):
    buffered = BytesIO()
    img.save(buffered, format="PNG")
    img_str = base64.b64encode(buffered.getvalue()).decode()
    return f'<a href="data:image/png;base64,{img_str}" download="image_output.png">Download Image</a>'

# QR Code Generation Section
st.subheader("QR Code Generator")
if st.button("Generate QR Code"):
    if text_input:
        qr_image = generate_qr_code(text_input)
        buffered = BytesIO()
        qr_image.save(buffered, format="PNG")
        st.image(buffered.getvalue(), caption="Generated QR Code", use_column_width=True)
        st.download_button(
            label="Download QR Code",
            data=buffered.getvalue(),
            file_name="qr_code.png",
            mime="image/png"
        )
    else:
        st.error("Please enter some text to generate a QR Code.")

# Text-to-Audio Conversion Section
st.subheader("Text to Audio Converter")
if st.button("Convert to Audio"):
    if text_input:
        audio_file = text_to_speech(text_input, lang=language_code)
        st.audio(audio_file, format="audio/mp3")
        st.download_button(
            label="Download Audio",
            data=audio_file,
            file_name="converted_audio.mp3",
            mime="audio/mp3"
        )
    else:
        st.error("Please enter some text to convert to audio.")

# Text-to-Image Section
st.subheader("Text to Image Converter")
if st.button("Convert to Image"):
    if text_input:
        image = create_image_with_text(text_input)
        st.image(image, caption="Generated Image with Text")
        st.markdown(convert_image_to_downloadable(image), unsafe_allow_html=True)
    else:
        st.error("Please enter some text to create an image.")

st.markdown("---")
st.caption("Developed by Sushant Kumar")