package com.company;

public class MinMaxElements {
    public static void main(String[] args) {
        int arr[] = {16 , 55, 44, 78};
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for(int i = 0;i <= arr.length-1 ; i++){
            if(arr[i] < minElement){
                minElement = arr[i];

            }else if(arr[i] > maxElement){
                maxElement = arr[i];
            }

        }
        System.out.println("Minimum element : " +minElement);
        System.out.println("Maximum element : " +maxElement);
    }
}
