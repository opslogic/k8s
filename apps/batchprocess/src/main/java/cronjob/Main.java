package cronjob;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Date() + ": Running the batch process.");

        // Simulate work.
        Thread.sleep(60 * 1000);

        System.out.println(new Date() + ": Completed the batch process.");
    }
}
