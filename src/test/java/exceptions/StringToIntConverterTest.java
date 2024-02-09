package exceptions;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntConverterTest {
    StringToIntConverter conversion = new StringToIntConverter();
    @Test
    public void testConversion() {
        Assert.assertEquals(2, conversion.convertString("2"));
    }
    @Test
    public void testConversionOverException() {
        Exception exception = Assert.assertThrows(NumberFormatException.class,
                () -> conversion.convertString("1.8"));
        Assert.assertEquals(exception.getMessage(), "Not an integer");
    }
}