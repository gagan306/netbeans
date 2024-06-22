
package studentinfomanager;
import java.io.*;
import java.util.Scanner;


class Student {
    int roll;
    String name;
    String address;

    Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return roll + "," + name + "," + address;
    }
}
public class StudentInfoManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // Input student information
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();

            students[i] = new Student(roll, name, address);
        }

        // Write student information to file
        try (FileWriter writer = new FileWriter("student.txt")) {
            for (Student student : students) {
                writer.write(student.toString() + "\n");
            }
            System.out.println("Student information written to student.txt.");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Read and display student information from file
        String fileName = "student.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Students from Kathmandu:");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int roll = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String address = parts[2];

                    if ("Kathmandu".equalsIgnoreCase(address.trim())) {
                        System.out.println("Roll: " + roll + ", Name: " + name + ", Address: " + address);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        scanner.close();
    }
    
}
