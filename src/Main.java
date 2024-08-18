import java.util.Scanner;
//Student grade calculator
public class Main {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int i;
        float total = 0, avg;
        int highestScore, lowestScore;
        Scanner scanner = new Scanner(System.in);

        // Input marks
        for (i = 0; i < 5; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();

        avg = total / 5;

        highestScore = marks[0];
        lowestScore = marks[0];

        // Compute highest and lowest scores
        for (i = 1; i < marks.length; i++) {
            if (marks[i] > highestScore) {
                highestScore = marks[i];
            }
            if (marks[i] < lowestScore) {
                lowestScore = marks[i];
            }
        }

        // Display highest and lowest scores
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);

        // Determine and display grade
        System.out.print("The student Grade is: ");
        if (avg >= 90) {
            System.out.print("A\nExcellent performance shown by the student!");
        } else if (avg >= 80 && avg < 90) {
            System.out.print("B\nVery good performance of the student!");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("C\nGood performance of the student!");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("D\nGood! Can be improved.");
        } else {
            System.out.print("E\nImprovement needed. Work Hard!");
        }
    }
}
