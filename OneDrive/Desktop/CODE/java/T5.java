class InvalidAgeException extends Exception { // Extending Exception instead of T5
    InvalidAgeException(String msg) {
        super(msg); // Properly passing message to Exception constructor
    }
}

public class T5 {
    public static void main(String[] args) {
        try {
            vote(19);
        } catch (InvalidAgeException e) { // Catch the specific exception
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}
