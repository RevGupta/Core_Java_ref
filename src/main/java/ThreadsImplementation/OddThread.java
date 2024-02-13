package ThreadsImplementation;

public class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 60; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}
