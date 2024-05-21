package TP8_1_H071231009;

import TP8_2_H071231009.Main;

public class BackgroundThread extends Thread {
    private static int failedLoads = 0;
    @Override
    public void run() {
        int executionTime = TaskTimeHelper.getRandomTime();
        try {
            Thread.sleep(executionTime * 1000);
            if (executionTime > 4) {
                System.out.println("Request Timeout");
                failedLoads++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int getFailedLoads() {
        return failedLoads;
    }
}
