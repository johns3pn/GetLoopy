import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int rollNum;
        int die1, die2, die3;
        int sum;
        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {

            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("------------------------------------");

            rollNum = 1;

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                sum = die1 + die2 + die3;

                System.out.println(rollNum + "\t" + die1 + "\t" + die2 + "\t" + die3 + "\t" + sum);

                rollNum++;

            } while (!(die1 == die2 && die2 == die3));

            System.out.print("\nPlay again? (Y/N): ");
            again = input.nextLine();

            System.out.println("\n----------------------\n");
        }

        System.out.println("Game Over!");
    }
}
