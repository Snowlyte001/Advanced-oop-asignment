import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of subjects and marks
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[] marks = new double[numberOfSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate average marks
        double averageMarks = totalMarks / numberOfSubjects;

        // Determine grade and pass/fail status
        String grade;
        String status;

        if (averageMarks >= 93) {
            grade = "A";
            status = "Passed exam";
        } else if (averageMarks >= 85) {
            grade = "B";
            status = "Passed exam";
        } else if (averageMarks >= 80) {
            grade = "C";
            status = "Passed exam";
        } else if (averageMarks >= 75) {
            grade = "D";
            status = "Passed exam";
        } else {
            grade = "E";
            status = "Failed exam";
        }

        // Output the results
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println(status);
    }
}