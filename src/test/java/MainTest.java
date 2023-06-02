import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {

//    @Test
//    void inputTest () {
//        String result = Main.userInput();
//        assertNotNull(result);
//    }

    @Test
    void isRangeTest (){
        boolean actual = Main.isRange("12345678");
        assertTrue(actual);
    }

    @Test
    void isRangeTest2 (){
        boolean actual = Main.isRange("12345");
        assertFalse(actual);
    }


    @Test
    void isNumberInPassTest () {
        boolean actual = Main.isNumberInPass("12345678");
        assertTrue(actual);
    }

    @Test
    void isNumberInPassTest2 () {
        boolean actual = Main.isNumberInPass("abcdefg");
        assertFalse(actual);
    }

    @Test
    void isLowerCaseInPassTest () {
        boolean actual = Main.isLowerCaseInPass("ABCDEFGHI");
        assertFalse(actual);
    }

    @Test
    void isLowerCaseInPassTest2 () {
        boolean actual = Main.isLowerCaseInPass("ABCDEFghHI");
        assertTrue(actual);
    }

    @Test
    void isUpperCaseInPassTest () {
        boolean actual = Main.isUpperCaseInPass("ABCDEFGHI");
        assertTrue(actual);
    }
    @Test
    void isUpperCaseInPassTest2 () {
        boolean actual = Main.isUpperCaseInPass("abcdefghi");
        assertFalse(actual);
    }

    @Test
    void isValidPassTest () {
        boolean actual = Main.isValidPass("123456");
        assertTrue(actual);
    }

    @Test
    void isValidPassTest2 () {
        boolean actual = Main.isValidPass("fghj46587tZ");
        assertFalse(actual);
    }

}
