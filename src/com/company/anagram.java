package com.company;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class anagram {
    public static void main(String[] args) {
        char []str = "Hih".toCharArray();
        char []str1 = "iHh".toCharArray();

//        str.toLowerCase();
        

//        char[] a1 = str.toCharArray();
//        char[] a2 = str1.toCharArray();

        if(anagramOrNot(str  , str1)){
            System.out.println("is anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
    static boolean anagramOrNot(char[] str, char[] str1) {
        int n1 = str1.length;
        int n2 = str.length;

        if (n1 != n2) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str);

        for (int i = 0; i < n2; i++) {
            if (str1[i] != str[i]) {
                return false;
            }

        }
        return true;
    }
}
