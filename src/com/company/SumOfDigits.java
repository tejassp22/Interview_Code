package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 54321;
        int sum = 0;

        while(n!= 0){
            int d = n%10;
            sum = sum +d;
            n /=10;
        }
        System.out.println(sum);
    }
}
