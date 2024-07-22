package Util;

import java.util.ArrayList;

public class BinaryHelper {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static boolean lengthIf;

    static boolean check() {
        if (numbers.size() < 1) {  // Check the size of the numbers list directly
            System.out.println("Array isn't big enough");
            lengthIf = false;
            return lengthIf;
        }
        lengthIf = true;
        return lengthIf;
    }

    public static void handleNum(Integer yourNumber) {
        numbers.add(yourNumber);
    }

    public static void guess(Integer number) {
        if (check()) {
            handleNum(number);
            int size = numbers.size();
            if (size >= 2) {  // Ensure there are at least two elements in the list
                Integer lastNumber = numbers.get(size - 1);
                Integer secondToLastNumber = numbers.get(size - 2);
                Integer sum = lastNumber + secondToLastNumber;
                Integer BinaryGuess = sum / 2;

                System.out.println(BinaryGuess);
            }
        } else {
            handleNum(number);
        }
    }
}
