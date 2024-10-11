import java.util.Scanner;
public class DiceRoller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a die value or type 'end': ");

        String chosenDie = input.nextLine();
        boolean isDie = true;

        if (chosenDie.equals("end")) {
        	isDie = false;
            System.out.print("Ending die rolls. Thank you.");
            System.exit(0); 
        }

        while (isDie){
        	if (chosenDie.equals("d4")){
            int result = (int)(Math.random() * 4);
            System.out.println("You roll a d4. The result is " + result);
            System.out.print("Please enter another die: ");
            chosenDie = input.nextLine();
        } else if (chosenDie.equals("d6")){
            int result = (int)(Math.random() * 6);
            System.out.println("You roll a d6. The result is " + result);
            System.out.print("Please enter another die: ");
            chosenDie = input.nextLine();
        } else if (chosenDie.equals("d8")){
            int result = (int)(Math.random() * 8);
            System.out.println("You roll a d8. The result is " + result);
            System.out.print("Please enter another die: ");
            chosenDie = input.nextLine();
        } else if (chosenDie.equals("d10")){
            int result = (int)(Math.random() * 10);
            System.out.println("You roll a d4. The result is " + result);
            System.out.print("Please enter another die: ");
            chosenDie = input.nextLine();
        } else if (chosenDie.equals("d12")){
            int result = (int)(Math.random() * 12);
            System.out.println("You roll a d4. The result is " + result);
            System.out.print("Please enter another die: ");
            chosenDie = input.nextLine();
        } else if (chosenDie.equals("d20")){
            int result = (int)(Math.random() * 20);
            System.out.println("You roll a d4. The result is " + result);
            System.out.print("Please enter another die: ");
            chosenDie = input.nextLine();
        } else {
            System.out.print("Please enter a valid die or type 'end': ");
        	chosenDie = input.nextLine();
        	if (chosenDie.equals("end")) {
        		isDie = false;
        		System.out.print("Ending die rolls. Thank you.");
        		System.exit(0);
        		}
        	}
        }
    }
}