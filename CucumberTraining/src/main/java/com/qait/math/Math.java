package com.qait.math;

public class Math{
       
/**
 * This method accepts two string and returns the 
 * sum of strings if they are Numbers
 * 
 * @param a
 * @param b
 * @return
 * @throws InputNotANumberException 
 */
    public int add (String a, String b) throws InputNotANumberException{
        int result;
        try{
            result = (Integer.parseInt(a) + Integer.parseInt(b));
        }
        catch (NumberFormatException nfe){
            throw new InputNotANumberException("The number entered can only be a number");
        }
        return result;
    }
}