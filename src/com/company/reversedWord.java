package com.company;

public class reversedWord {
    public static void main(String[] args) {
        String str = "This is java";
        String [] a = str.split(" ");

        for(int i = a.length-1; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }
    }

}
