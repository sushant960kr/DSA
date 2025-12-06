import java.util.Scanner;

public class AvgMrks {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int sub = r.nextInt();
        int total = sub*100;

        int sum = 0;

        for (int i = 1; i <= sub; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = r.nextInt();
            sum += marks;
        }

        double avg = (double) sum / sub;
        double percentage= (double)sum/total *100;

        double cgpa= percentage/9.5;

        System.out.println("Sum of the marks is: " + sum);
        System.out.println("Average of the marks is: " + avg);

        System.out.println("Perctange is "+percentage);
        System.out.println("CGPA of the marks is "+cgpa);

    }
}
