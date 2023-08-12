/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTraining6Jan.Regex;

import java.util.regex.Pattern;

/**
 *
 * @author Prashant Shukla <prashantshukla@qainfotech.com>
 */
public class RegextTest {
    public static void main(String... args){
    
        Pattern p = Pattern.compile("([0-9])([a-z])\\1");
        
        
         String targettext = "javvva traaining 1123456778 classes";
         
         
         System.out.println(p.matcher(targettext).replaceAll("-"));
         
         
         
    }
}
