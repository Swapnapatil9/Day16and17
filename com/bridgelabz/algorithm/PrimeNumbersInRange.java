package com.bridgelabz.algorithm;

public class PrimeNumbersInRange {
    static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int lower=0;
        int higher=1000;
        for (int i=lower;i<=higher;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
