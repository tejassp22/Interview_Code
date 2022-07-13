package com.company;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 434;
        int temp = n;
        int rev = 0;

        while(n!= 0){
            int d = n%10;
            rev = rev *10+d;
            n /= 10;
        }
        if(temp == rev){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Nit Palindrome");
        }
    }
}
