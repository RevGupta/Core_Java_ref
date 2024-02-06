package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseConverterTest {

    @Test //ConvertCaseWithEmptyString
    public void test1() {
        CaseConverter caseConverter = new CaseConverter();
        assertEquals("", caseConverter.convertCase(""));
    }

    @Test //ConvertCaseWithLowerCaseString
    public void test2() {
        CaseConverter caseConverter = new CaseConverter();
        assertEquals("HELLO", caseConverter.convertCase("hello"));
    }

    @Test //ConvertCaseWithUpperCaseString
    public void test3() {
        CaseConverter caseConverter = new CaseConverter();
        assertEquals("world", caseConverter.convertCase("WORLD"));
    }

    @Test //ConvertCaseWithMixedCaseString
    public void test4() {
        CaseConverter caseConverter = new CaseConverter();
        assertEquals("HeLLo WoRLd", caseConverter.convertCase("hEllO wOrlD"));
    }

    @Test //ConvertCaseWithNonAlphabeticCharacters
    public void test5() {
        CaseConverter caseConverter = new CaseConverter();
        assertEquals("!@#$%^&*()", caseConverter.convertCase("!@#$%^&*()"));
    }
}
