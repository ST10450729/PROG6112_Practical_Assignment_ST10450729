/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.info;

/**
 *
 * @author rakwa
 */
public class StudentInfo {
    
    public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;

    public Student(int id, String name, int age, String email, String course) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive integer");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 18 || age > 25) {
            throw new IllegalArgumentException("Age must be between 18 and 25");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be empty");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public boolean isValidAge() {
        return age >= 18 && age <= 25;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
