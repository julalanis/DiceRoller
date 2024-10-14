public class Die extends DiceRoller {
    private int numDie;
    private int valueDie;
    private int modifier;
    private int result;
    private int total;

    public Die(){
    }

    public Die(int numDie, int valueDie){
        this.numDie = numDie;
        this.valueDie = valueDie;
    }

    public int getNumDie(){
        return numDie;
    }

    public int getValueDie(){
        return valueDie;
    }

    public int getModifier(){
        return modifier;
    }

    public int getResult(){
        return result;
    }

    public int getTotal(){
        return total;
    }

    public void setNumDie(int numDie){
        this.numDie = numDie;
    }

    public void setValueDie(int valueDie){
        this.valueDie = valueDie;
    }

    public void setModifier(int modifier){
        this.modifier = modifier;
    }

    public void setResult(int result){
        this.result = result;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public String dieToString(){
        return "This successfully copied the input values of numDie: " + numDie + " and valueDie: " + valueDie;
    }

    public void rollDie(int x, int y){
        for (int i = 0; i < x; i++){
            result = (int)(Math.random() * y);
            total += result;
            System.out.println("You rolled a " + result);

        }
        System.out.println("The total is: " + total);
        int newTotal = total + modifier;
        System.out.println("With modifier of " + modifier + ", the new total is: " + newTotal);
    }
}
