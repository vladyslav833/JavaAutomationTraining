/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTrainingPaid.getInterest;

import JavaTrainingPaid.InterestCalculation.CompoundInterest;
import JavaTrainingPaid.InterestCalculation.Intrest;
import JavaTrainingPaid.InterestCalculation.SimpleInterest;

/**
 *
 * @author Prashant Shukla <prashantshukla@qainfotech.com>
 */
public class getInterest {

    public static void main(String[] args) {
        int p1 = 10000, t1 = 10;
        int p2 = 3000, t2 = 5;

        Intrest si1 = new SimpleInterest(p1, t1);
        Intrest ci1 = new CompoundInterest(p2, t2);

        System.out.println(si1.getIntrest());
        System.out.println(ci1.getIntrest());
    }

}
