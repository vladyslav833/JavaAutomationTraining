/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTrainingPaid.InterestCalculation;

/**
 *
 * @author Prashant Shukla <prashantshukla@qainfotech.com>
 */
public class CompoundInterest implements Intrest {

    private final int principle;
    private final int time;

    public CompoundInterest(int principle, int time) {
        this.principle = principle;
        this.time = time;
    }

    @Override
    public double getIntrest() {
        return principle + java.lang.Math.pow(rateOfIneterest, time);
    }

}
