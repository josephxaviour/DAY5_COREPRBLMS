package com.basiccoreprograms;

public class HarmonicNo {
    static void harmonicnumber(double num){
        double sum = 0;
        for(double i=1; i<=num; i++){
            sum = sum + (1/i);
        }
        System.out.println(sum);
    }
public static void main(String[] args) { harmonicnumber(5);
    }
}


