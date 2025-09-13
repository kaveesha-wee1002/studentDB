package studentdb;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== Student Database Menu =====");
            System.out.println("1. Insert Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    dao.insertStudent(new Student(name, age, email));
                    break;
                case 2:
                    List<Student> students = dao.getAllStudents();
                    students.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();
                    dao.updateStudent(idUpdate, newName, newAge, newEmail);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int idDelete = sc.nextInt();
                    dao.deleteStudent(idDelete);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}