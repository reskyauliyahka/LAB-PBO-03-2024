package TP8_1_H071231009;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomTime() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
