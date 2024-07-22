package Random;

import java.util.Random;

public class Number {
    static int number;
    public static int numberGenerator(){
        Random rand = new Random();
        number = rand.nextInt(101);
        return number;
    }
}
