/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.InputMismatchException;

/**
 *
 * @author rakwa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION *** [Enter (1) to launch menu or any key to exit] ");
            String choice = scanner.next();
            
            if (choice.equals("1")) {
                while  (true) {
                    System.out.println("\nMenu: ");
                    System.out.println("1. Capture new student");
                    System.out.println("2. Search for student");
                    System.out.println("3. Delete student");
                    System.out.println("4. view student report");
                    System.out.println("5. Exit application");
                    System.out.println("\nEnter your choice: ");
                    
                    try {
                        int option = scanner.nextInt();
                        
                        if (option < 1 || option > 5) {
                            System.out.println("Invalid choice. Please enter a number. ");
                            
                        }
                        
                       switch (option) {
                           case 1 -> studentManager.saveStudent(scanner);
                           case 2 -> studentManager.searchStudent(scanner);
                           case 3 -> studentManager.deleteStudent(scanner);
                           case 4 -> studentManager.studentReport();
                           case 5 -> studentManager.exitStudentApplication();
                       }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); //consume the invalid input
                    }
                }
            } else {
                System.out.println("Exiting application");
                System.exit(0);
            }
        }
    }
    
}
