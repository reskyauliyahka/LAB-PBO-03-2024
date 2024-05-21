package TP8_1_H071231009;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int numSources = 4;
        UIThread uiThread = new UIThread();
        uiThread.startLoading(numSources);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit background threads for data loading
        for (int i = 0; i < numSources; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.updateLoading(totalTime);
            }
            uiThread.taskFinish(totalTime, numSources - BackgroundThread.getFailedLoads(), BackgroundThread.getFailedLoads());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
