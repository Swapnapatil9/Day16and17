package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Permutation {
    public static void permutation(String str, String str1){
        if(str.length()==0){
            System.out.println(str1);
        }
        for(int i=0;i<str.length();i++) {
            char x = str.charAt(i);
            String x1 = str.substring(0, i) + str.substring(i + 1);
            permutation(x1, str1+x);
        }
    }

    public static void main(String[] args) {
        permutation ("abc","");
    }
}
