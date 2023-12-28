package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void testEvenNumber() {
        assertTrue(mainHW.evenOddNumber(4));
    }

    @Test
    void testOddNumber() {
        assertFalse(mainHW.evenOddNumber(7));
    }
    @Test
    void testNumberInInterval() {
        assertTrue(mainHW.numberInInterval(50));
    }

    @Test
    void testNumberOutOfInterval() {
        assertFalse(mainHW.numberInInterval(20));
    }

}
