import java.util.Stack;

public class histogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];

        Stack<Integer> s = new Stack<>();

        // Next Smaller Right (NSR)
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n; // boundary
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left (NSL)
        s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // boundary
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate max area
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println("Maximum area of histogram is: " + result);
    }
}
