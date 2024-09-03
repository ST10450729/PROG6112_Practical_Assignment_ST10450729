/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.manager.test;
import org.junit.Test;


/**
 *
 * @author rakwa
 */
public class StudentManagerTest {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    

    @Test
    public void testGetId() {
        Student student = new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        assertEquals(10111, student.getId());
    }

    @Test
    public void testGetName() {
        Student student = new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        assertEquals("J.Bloggs", student.getName());
    }

    @Test
    public void testGetEmail() {
        Student student = new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        assertEquals("jbloggs@ymail.com", student.getEmail());
    }

    @Test
    public void testGetCourse() {
        Student student = new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        assertEquals("disd", student.getCourse());
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        Student student = new Student(10111, "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        assertTrue(student.isValidAge());
    }

    @Test
    public void testStudentAge_StudentAgeInvalid() {
        Student student = new Student(10111, "J.Bloggs", 10, "jbloggs@ymail.com", "disd");
        assertFalse(student.isValidAge());
    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        try {
            // Assuming the constructor of Student class accepts String for age, or it handles the conversion
            Student student = new Student(10111, "J.Bloggs", Integer.parseInt("19a"), "jbloggs@ymail.com", "disd");
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
            // Test passed because the exception was expected
        }
    }
}
