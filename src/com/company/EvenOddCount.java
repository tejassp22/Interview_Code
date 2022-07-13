package com.company;

public class EvenOddCount {
    public static void main(String[] args) {
        int n = 54321;
        int eCount =0;
        int oCount =0;

        while(n!=0){
            int d = n%10;
            if(d%2 == 0){
                eCount++;
            }else{
                oCount++;
            }
            n/=10;
        }
        System.out.println("Even Count is: " +eCount);
        System.out.println("Odd Count is: " +oCount);
    }
}
