package com.qait.math;

public class InputNotANumberException extends NumberFormatException{
    
    private static final long serialVersionUID = 1L;

	public InputNotANumberException(String s){
        super (s);
    }
    
}
