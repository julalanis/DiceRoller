import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die = new Die();

        System.out.print("Please enter number of dice you would like to roll: ");
        int numDie = (scanner.nextInt());
        die.setNumDie(numDie);


        System.out.print("Please enter value of die (2, 4, 6, 8, 10, 12, 20): ");
        int valueDie = scanner.nextInt();
        die.setValueDie(valueDie);

        System.out.print("Please enter any modifiers: ");
        int modifier = scanner.nextInt();
        die.setModifier(modifier);

        die.rollDie(numDie, valueDie);

    }
}
