package utils;
import java.util.Random;

public class helperFunctions {
    public helperFunctions() {
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
}
