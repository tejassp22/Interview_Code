package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String temp = "";

//        int i = str.length()-1;
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        System.out.println(temp);
    }
}
