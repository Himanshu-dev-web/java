package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {5,5,6,5,4,8,7,9,46,3,5,5,3,2,0,5,100};

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
         sum = sum+ intArray[i];

        }

        System.out.println(sum);
    }
}
