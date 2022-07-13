package com.company;

public class EvenOddInArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5};



        for(int element: a){
            if(element % 2 == 0){
                System.out.println(element);
            }
        }
    }
}
