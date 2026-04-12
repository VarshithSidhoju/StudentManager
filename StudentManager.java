import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(String name, int age) {
        students.add(new Student(name, age));
        System.out.println("Student added!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
    }

    public static void searchStudent(String name) {
    for (Student s : students) {
        if (s.name.equalsIgnoreCase(name)) {
            System.out.println("Found: " + s.name + ", Age: " + s.age);
            return;
        }
    }
    System.out.println("Student not found.");
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    addStudent(name, age);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}