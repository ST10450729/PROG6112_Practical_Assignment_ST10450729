/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Code Attribution 
//This 
package student.manager;
import java.util.ArrayList;
import java.util.Students;
import java.util.Scanner;
   
/**
 *
 * @author rakwa
 */


public class StudentManager {
    private ArrayList<Student> students;
    
    public StudentManager() {
        students = new ArrayList<>();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    } 
    
    public void saveStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.next();
        
        if (isStudentIdUnique(id)) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            int age;
            while (true) {
                System.out.print("Enter student age: ");
                try {
                    age = Integer.parseInt(scanner.next());
                    if (age < 16){
                        System.out.println("Invalid age. Age must be or older.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
            System.out.print("Enter student course: ");
            String course = scanner.next();
            Student student = new Student(id, name, age, course);
            students.add(student);
            System.out.println("Student details saved successfully.");
        } else {
            System.out.println("Student ID already exists. Please enter a unique ID.");
        }
    }

    private boolean isStudentIdUnique(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }
    
    public void searchStudent(Scanner scanner) {
        System.out.print("Enter student ID to search: ");
        String id = scanner.next();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found:");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Course: " + student.getCourse());
                return;
            }
        }
        System.out.println("Student not found.");
    }
    
    public void deleteStudent(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        String id = scanner.next();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Are you sure you want to delete this student? (y/n): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("y")) {
                    students.remove(student);
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }
    
    public void studentReport() {
        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Course: " + student.getCourse());
            System.out.println();
        }
    }

    public void exitStudentApplication() {
        System.out.println("Exiting application.");
        System.exit(0);
    }
}
            
    



