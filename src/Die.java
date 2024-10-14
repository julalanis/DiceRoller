public class Die extends DiceRoller {
    private int numDie;
    private int valueDie;

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

    public void setNumDie(int numDie){
        this.numDie = numDie;
    }

    public void setValueDie(int valueDie){
        this.valueDie = valueDie;
    }

    public String dieToString(){
        return "This successfully copied the input values of numDie: " + numDie + " and valueDie: " + valueDie;
    }

}
