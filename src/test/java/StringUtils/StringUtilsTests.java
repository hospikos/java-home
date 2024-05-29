package StringUtils;

import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTests {

    @Test
    void isBlankTest() {
        String blankString = "";
        boolean result = StringUtils.isBlank(blankString);
        assertTrue(result);
    }

    @Test
    void isNonBlankTest() {
        String nonBlankString = "Hello World!!!";
        boolean result = StringUtils.isNotBlank(nonBlankString);
        assertTrue(result);
    }

    @Test
    void isLowerCase() {
        String lowerCase = "hello";
        boolean result = StringUtils.isAllLowerCase(lowerCase);
        assertTrue(result);
    }

    @Test
    void isUpperCase() {
        String upeprCase = "HELLO";
        boolean result = StringUtils.isAllUpperCase(upeprCase);
        assertTrue(result);
    }

    @Test
    void isMixedCase() {
        String mixedCase = "Hello";
        boolean result = StringUtils.isMixedCase(mixedCase);
        assertTrue(result);
    }

    @Test
    void isNumeric() {
        String numeric = "123";
        boolean result = StringUtils.isNumeric(numeric);
        assertTrue(result);
    }

    @Test
    void isWhiteSpace() {
        String whiteSpace = " ";
        boolean result = StringUtils.isWhitespace(whiteSpace);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"iphone 11", "iphone 12", "iphone 13"})
    void isIphone(String device) {
        boolean result = StringUtils.startsWith(device, "iphone");
        assertTrue(result);
    }

    @Test
    void replace() {
        String replacedString = "day";
        String result = StringUtils.replace(replacedString, "day", "night");
        assertEquals(result, "night");
    }

    @Test
    void reverse() {
        String reversedString = "hello";
        String result = StringUtils.reverse(reversedString);
        assertEquals(result, "olleh");
    }

}
