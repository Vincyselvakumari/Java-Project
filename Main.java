import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int age;
        while (true) {
            System.out.print("Enter age: ");
            age = sc.nextInt();
            if (age > 0) break;
            System.out.println("Age must be a positive number. Try again.");
        }
        sc.nextLine(); // consume newline

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter college name: ");
        String collegeName = sc.nextLine();

        // Create and display student info
        Student student = new Student(name, age, course, collegeName, studentId);
        student.displayInfo();}
}