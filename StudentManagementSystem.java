import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    String getGrade() {
        if (mark >= 90)
            return "A";
        else if (mark >= 80)
            return "B";
        else if (mark >= 70)
            return "C";
        else if (mark >= 60)
            return "D";
        else
            return "F";
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student mark: ");
                    int mark = sc.nextInt();

                    students.add(new Student(name, mark));

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student List ---");

                        for (Student s : students) {
                            System.out.println(
                                    "Name: " + s.name +
                                    " | Mark: " + s.mark +
                                    " | Grade: " + s.getGrade());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}