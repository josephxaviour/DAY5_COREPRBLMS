package com.basiccoreprograms;

public class Largest_Among_3Nos {
    static void largest(int num1, int num2, int num3){
        if(num1 > num2){
            if(num1 > num3) {
                System.out.println( num1 + " is largest ");
            }else {
                System.out.println(num2 + " is largest ");
            }

            }else {
            if(num3 > num2) {
                System.out.println(num3 + " is largest ");
            }else{
                System.out.println(num2 + "is largest ");

            }
        }
    }
    public static void main(String[] args) { largest(99,55,66);}
}
