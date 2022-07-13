package com.company;

public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 0;
        int n2 = 1;
        int counter = 0;

        while (counter < n){
            System.out.print(n1+ " ");
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            counter++;
        }
    }
}
