/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTrainingPaid.InterestCalculation.Looping;

/**
 *
 * @author Prashant Shukla <prashantshukla@qainfotech.com>
 */
public class ForEach {
    public static void main (String... args){
        String [] names = {"Prashant", "Simil", "Mridul", "Nitish"};
        
//        for (int i = 0; i < names.length; i++){
//            System.out.println("QAIT " + names[i]);
//        }
//        
//        for (String name : names){
//            System.out.println("QAIT " + name);
//        }
        
        int i = 0;
        
        while (i > names.length){
            System.out.println("QAIT " + names[i]);
            i++;
        }
        System.out.println("\n**************\n");
        do{
             System.out.println("QAIT " + names[i]);
            i++;
        }
        while(i > names.length);
        
    }
}
