package com.qait.math;

import org.junit.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex{

    String sourceStr = "This is the aaa cc 'test' string"
                     + " that I 'am using' to demo"
                     + " regex 'string' aaaaa bbbb extraction";

    @Test
    public void getExtractedString(){
        Pattern pattern = Pattern.compile("(.)\\1{3,}");
        Matcher matcher = pattern.matcher(sourceStr);
        int matchcount = 0;
        while (matcher.find()){
            System.out.println(matcher.group(1));
            matchcount++;
        }
        System.out.println(matchcount);
    }
}