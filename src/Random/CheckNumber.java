package Random;

public class CheckNumber {
    public static boolean CheckNumber(int number, int yourNumber) {
        if (number == yourNumber) {
            System.out.println("Great guess =)");
            return true;
        }
        else if (number < yourNumber) {
            System.out.println(yourNumber + " is to high");
            return false;
        }
        else
            System.out.println(yourNumber + " is to low");
            return false;
    }
}
