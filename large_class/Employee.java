package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public Employee(String name, String officeAreaCode)
    {
        _name = name;
        _officeAreaCode = officeAreaCode;
    }
    public phone_number(String officeNumber,String officeExtensionNumber) {
    	_officeNumber = officeNumber;
    	_officeExtensionNumber = officeExtensionNumber;
    	
    }

    public String getTelephoneNumber()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }

    public String getName()
    {
        return _name;
    }
}
