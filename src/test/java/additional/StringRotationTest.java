package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringRotationTest {

    @Test //IsRotationWithEmptyStrings
    public void test() {
        StringRotation stringRotation = new StringRotation();
        assertFalse(stringRotation.isRotation("", ""));
    }

    @Test //IsRotationWithDifferentLengths
    public void test2() {
        StringRotation stringRotation = new StringRotation();
        assertFalse(stringRotation.isRotation("abc", "abcd"));
    }

    @Test //IsRotationWithRotation
    public void test3() {
        StringRotation stringRotation = new StringRotation();
        assertTrue(stringRotation.isRotation("abcde", "deabc"));
    }

    @Test //IsRotationWithNonRotation
    public void test4() {
        StringRotation stringRotation = new StringRotation();
        assertFalse(stringRotation.isRotation("abcde", "edcba"));
    }

    @Test //IsRotationWithRepeatedCharacters
    public void test5() {
        StringRotation stringRotation = new StringRotation();
        assertTrue(stringRotation.isRotation("aabbaabb", "bbaabbaa"));
    }
}

