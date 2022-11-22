package com.basiccoreprograms;

public class Swap2Nos {
    static void swapNos(int a, int b){
        System.out.println(" value of a is " + a);
        System.out.println(" value of b is " + b);
        int swap = a;
        a = b;
        b = swap;

        System.out.println(" value of a after swap is " +  a);
        System.out.println(" value of b after swap is " +  b);
    }
public static void main (String[] args) { swapNos(2,5);}
}

