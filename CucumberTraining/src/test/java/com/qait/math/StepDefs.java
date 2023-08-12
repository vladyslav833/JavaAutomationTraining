package com.qait.math;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class StepDefs{
    Math math = new Math();
    int result; 

    
    @Given("^I have a calculator$")
public void i_have_a_calculator() throws Throwable {
    
}

@When("^I add (.*?) and (.*?)$")
public void i_add_and(String arg1, String arg2) throws Throwable {
    System.out.println(arg1 + "    " + arg2);
    result = math.add(arg1, arg2);
}

@Then("^the result should be (\\d+)$")
public void the_result_should_be(int arg1) throws Throwable {
assertEquals(arg1, result);
}
}