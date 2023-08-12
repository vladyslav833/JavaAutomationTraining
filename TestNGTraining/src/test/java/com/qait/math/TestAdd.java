package com.qait.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.Reporter;

public class TestAdd {

    @Test(dataProvider = "getData")
    public void testPositiveScenario(String a, String b, int output) {
        Math math = new Math();
        int result = math.add(a, b);
        assertEquals(output, result);
        Reporter.log("Expected output" + result);
    }

    @DataProvider(name = "data")
    public Object[][] getData() {

        Object[][] data = new Object[4][3];

        // 1st row
        data[0][0] = "1";
        data[0][1] = "2";
        data[0][2] = 3;

        // 2nd row
        data[1][0] = "-1";
        data[1][1] = "2";
        data[1][2] = 1;

        // 3rd row
        data[2][0] = "b";
        data[2][1] = "2";
        data[2][2] = 5;

        // 3rd row
        data[3][0] = "-3";
        data[3][1] = "-6";
        data[3][2] = -9;

        return data;

    }

}