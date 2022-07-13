package com.company;

import org.w3c.dom.ls.LSOutput;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1,2,4,5};
         int sum1 = 0;
         for(int i = 0; i<= arr.length-1 ; i++){
             sum1 = sum1+arr[i];
         }
        System.out.println("Sum1 without missing number is : " +sum1);

         int sum2 = 0;
         for(int i = 1 ; i <= 5; i++){
             sum2 = sum2+i;
         }
        System.out.println("sum including missing number is : " +sum2);
         int number = sum2 - sum1;
        System.out.println("missing number is : " +number);
    }

}
