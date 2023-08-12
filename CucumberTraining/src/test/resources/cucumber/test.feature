Feature: Calculator
    As a user
    I want to use a calculator
    So that I don't need to calculate myself

    Scenario Outline: Add two numbers
        Given I have a calculator
        When I add <arg1> and <arg2>
        Then the result should be <expected>
        
    Examples:
    |arg1|arg2|expected|
    |1|2|3|
    |a|b|3|
    |-1|2|1|
    
    