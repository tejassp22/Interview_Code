package com.company;

import org.w3c.dom.ls.LSOutput;

public class ReverseWordsInString {
    public static void main(String[] args) {
        ReverseWordsInString obj = new ReverseWordsInString();
        obj.ReverseWords("This is Java");

    }
    public void ReverseWords(String str) {
//        String [] words = str.split(" ");
//        String reversedString ="";
//
//        for(int i=0; i<= words.length-1 ; i++){
//            String word = words[i];
//            String reversedWord = "";
//            for(int j = word.length()-1; j>=0; j--){
//                reversedWord = reversedWord + word.charAt(j);
//            }
//            reversedString = reversedString + reversedWord + " ";
//        }
//        System.out.println(str);
//        System.out.println(reversedString);
//    }
        String [] words = str.split(" ");
        String reveresedString = "";

        for(int i = 0; i< words.length ; i++){
            String word = words[i];
            String reversedWord = "";

            for(int j = word.length()-1; j>= 0 ; j--){
                reversedWord = reversedWord + word.charAt(j);
            }
            reveresedString = reveresedString + reversedWord + " ";
        }
        System.out.println(str);
        System.out.println(reveresedString);
    }

}
