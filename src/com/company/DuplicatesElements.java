package com.company;

public class DuplicatesElements {
    public static void main(String[] args) {
        String arr[] = {"Java" , "C++" , "C++" , "python" , "Java"};

        boolean flag = false;
        for(int i = 0; i< arr.length ; i++){
            for(int j = i+1; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Found duplicate: " +arr[i]);
                    flag =true;
                }
            }
        }
        if(flag == false){
            System.out.println("No duplicates");
        }
    }
}
