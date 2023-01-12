package Lessons;
public class Java24_CustomClass01032023
{
    /*
    CUSTOM CLASS
    you can create your own custom class in java with your own instance. variables and methods as well

    INSTANCE VARIABLE
    these are created outside the methods within the class
    we mainly use for storing data into objects it belongs to the objects
    it is also called fields
    locally created within the methods. not visible to the other methods. can be only used within the method
         */
    String studentName="Muammer"; // this is an instance variable
    int StudentIdNumber; // this is another instance variable
    String StudentTitle;
    long SSN;
    String Gender;
    double Salary;

    //INSTANCE METHOD
    // methods that does not have static specifier but do have a return type

    public void WhatDoesItDo()
    {
        System.out.println(studentName+" learning apcsa");
    }
    public void GetInfo()
    {
        System.out.println("Student Name is "+studentName+" id number is "+StudentIdNumber+" title is "+StudentTitle);
    }
     



}
