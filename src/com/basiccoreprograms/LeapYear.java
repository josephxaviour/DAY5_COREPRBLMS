package com.basiccoreprograms;

public class LeapYear {
    static void checkLeapYear(int year) {


        if((year % 4 ==0 && 100 !=0) || year % 400 ==0){
            System.out.println( year + " is a leap year ");
        }else {
            System.out.println( year + " is not a leap year ");
        }
    }
    public static void main(String[] args) { checkLeapYear(1999);
}
}