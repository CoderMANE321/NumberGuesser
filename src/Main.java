import java.util.Random;
import java.util.Scanner;
import Random.Number;
import Random.CheckNumber;
import Util.BinaryHelper;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Number rand  = new Number();
        CheckNumber check = new CheckNumber();
        BinaryHelper binary = new BinaryHelper();
        int guessNumber;
        guessNumber = rand.numberGenerator();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int input;
            System.out.println("Enter a number: ");
            input = sc.nextInt();

            binary.guess(input);

            boolean result = check.CheckNumber(guessNumber, input);

            if (result) {
                break;
            }

        }
    }
}