package com.basiccoreprograms;

public class VowelorConst {
    static void checkvowelorconst(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println(ch + " is a vowel ");
        }else {
            System.out.println(ch + " is a constant ");
        }
    }
public static void main(String[] args) {
        checkvowelorconst('x');
}

}

