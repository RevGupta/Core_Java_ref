package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetUniqueWordCountTest {

    @Test //GetUniqueCountWithEmptyString
    public void test1() {
        assertEquals(0, GetUniqueWordCount.GetUniqueCount(""));
    }

    @Test //GetUniqueCountWithNoRepeats
    public void test2() {
        assertEquals(4, GetUniqueWordCount.GetUniqueCount("This is a sample"));
    }

    @Test //GetUniqueCountWithRepeats
    public void test3() {
        assertEquals(6, GetUniqueWordCount.GetUniqueCount("This is a sample with repeats this is"));
    }

    @Test //GetUniqueCountWithSpecialCharacters
    public void test4() {
        assertEquals(6, GetUniqueWordCount.GetUniqueCount("Hello, world! This is a test world#. Hello, world!"));
    }

    @Test //GetUniqueCountWithNumbers
    public void test5() {
        assertEquals(3, GetUniqueWordCount.GetUniqueCount("123 456 789 123 456"));
    }
}


