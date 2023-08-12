package com.qait.math;

import org.junit.*;
import static org.junit.Assert.*;
//import com.qait.math.*;

public class TestAddJunit{

   @Test
   public void testPositiveScenario(){
       Math math = new Math();
       int result = math.add("4", "2");
       System.out.println();
       assertEquals(6, result);
   }
   
   //@Test
   public void testExceptionScenario(){
       Math math = new Math();
       System.out.println(math.add("a", "2"));
   }
    
}