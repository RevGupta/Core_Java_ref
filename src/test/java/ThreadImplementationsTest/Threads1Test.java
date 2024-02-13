package ThreadsImplementatiosTest;

import ThreadsImplementation.EvenThread;
import ThreadsImplementation.OddThread;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertTrue;

public class Threads1Test {
    @Test
    public void testThreads() throws InterruptedException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();

        Thread.sleep(1000); // Wait for threads to complete

        String[] lines = outContent.toString().split(System.lineSeparator());

        boolean evenPrinted = false;
        boolean oddPrinted = false;

        for (String line : lines) {
            if (line.startsWith("Even Thread")) {
                int number = Integer.parseInt(line.substring(line.lastIndexOf(" ") + 1));
                if (number % 2 != 0) {
                    evenPrinted = false;
                    break;
                }
                evenPrinted = true;
            } else if (line.startsWith("Odd Thread")) {
                int number = Integer.parseInt(line.substring(line.lastIndexOf(" ") + 1));
                if (number % 2 == 0) {
                    oddPrinted = false;
                    break;
                }
                oddPrinted = true;
            }
        }

        assertTrue(evenPrinted && oddPrinted);
    }
}
