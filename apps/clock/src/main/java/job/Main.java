package job;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(new Date() + ": Polling queue for new work items.");

            Thread.sleep(2000);
        }
    }
}
