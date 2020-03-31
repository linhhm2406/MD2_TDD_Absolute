import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    @DisplayName("Test number 0")
    void getAbsoluteNumber0() {
        int number = 0;
        int expected = 0;
        int actual = AbsoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test number 1")
    void getAbsoluteNumber1() {
        int number = 1;
        int expected = 1;
        int actual = AbsoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test number -1")
    void getAbsoluteNumber_1() {
        int number = -1;
        int expected = 1;
        int actual = AbsoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected,actual);
    }
}