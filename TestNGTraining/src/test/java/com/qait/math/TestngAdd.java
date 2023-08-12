package com.qait.math;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestngAdd{
    Math math;

    @BeforeClass
    public void initilizeMath(){
        math = new Math();
    }

   @Test
   public void testPositiveScenario(){
       int result = math.add("4", "2");
       assertEquals(6, result);
   }
   
   @Test (dependsOnMethods = {"testPositiveScenario"})
   public void testDependency(){
       int result = math.add("1", "2");
       assertEquals(3, result);
   }
   
   @Test (expectedExceptions = InputNotANumberException.class)
   public void testExceptionScenario(){
       int result = math.add("4", "a");
       assertEquals(3, result);
   }
   
}