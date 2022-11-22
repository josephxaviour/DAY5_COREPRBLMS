package com.basiccoreprograms;

public class QuotientRemainder {
    static void quotientAndRemainder(int a,int b){
        int x = a / b;
        int y = a % b;
        System.out.println(" quotient is  " + x);
        System.out.println(" remainder is " + y);
    }
public static void main(String[] args) {
        quotientAndRemainder(45,9);
}
}

