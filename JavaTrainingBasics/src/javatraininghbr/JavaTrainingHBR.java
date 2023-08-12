/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraininghbr;

/**
 *
 * @author Prashant Shukla <prashantshukla@qainfotech.com>
 */
public class JavaTrainingHBR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int factor1 = 3;
        int factor2 = 5;
        
        System.out.println(getExclusiveFactors(15, factor1, factor2));
        System.out.println(getExclusiveFactors(12, factor1, factor2));
        System.out.println(getExclusiveFactors(10, factor1, factor2));
        System.out.println(getExclusiveFactors(11, factor1, factor2));
    }
    
    /**
     * 
     * Takes original number and two expected factors and 
     * returns if the original number has one and only one 
     * of the expected factor as factor 
     * 
     * @param original
     * @param factor1
     * @param factor2
     * @return 
     */
    public static Boolean getExclusiveFactors (int original, int factor1, int factor2){
        return (isFactor(original, factor1) || isFactor(original, factor2)) && (!isFactor(original, (factor1 * factor2)));
    }
    
    /**
     * Returns if factor is factor of the original number
     * 
     * @param original
     * @param factor
     * @return 
     */
    private static boolean isFactor(int original, int factor){
        return (original % factor) == 0;
    } 
}
