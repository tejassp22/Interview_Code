package com.company;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Hiih";
        str = str.toLowerCase();
        String temp = "";


        for(int i = str.length()-1; i>=0 ; i--){
            temp = temp + str.charAt(i);

        }
        if(str.equals(temp)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
