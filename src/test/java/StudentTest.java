import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class StudentTest {
    @Test
    void testIsDoingMBKM(){
        Student student = new Student("Edi", 7, true);
        assertAll(
                ()-> Assertions.assertEquals("Edi", student.name),
                ()-> Assertions.assertTrue(student.isDoingMBKM())
        );

    }
}
