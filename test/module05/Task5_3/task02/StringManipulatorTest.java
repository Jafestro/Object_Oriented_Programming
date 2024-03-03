package module05.Task5_3.task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void concatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("Hello World", sm.concatenate("Hello ", "World"));
    }

    @Test
    void findLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(11, sm.findLength("Hello World"));
    }

    @Test
    void convertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HELLO WORLD", sm.convertToUpperCase("Hello World"));
    }

    @Test
    void convertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello world", sm.convertToLowerCase("Hello World"));
    }

    @Test
    void containsSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("Hello World", "World"));
        assertFalse(sm.containsSubstring("Hello World", "world"));
    }
}