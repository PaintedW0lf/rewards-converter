public class RewardValue {

    // Variables
    private double cashValue = 0;
    private int milesValue =0;

    // Constructor

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue( int milesValue){
        this.milesValue = milesValue;
    }

    // Getters
    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        return this.milesValue;
    }   

    /*convert from miles to cash at a rate of 0.0035
     means 1 mile = 0.0035 cash */

     // Method to convert into cash
    public double convertMilesToCash(){
        return this.milesValue * 0.0035;
    }
}
