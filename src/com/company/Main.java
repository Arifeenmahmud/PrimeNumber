package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        int temp=0;

        for (int i = 2; i < no-1; i++) {

            if(no%i==0){
                temp = temp+1;

            }
        }
        if (temp>0) {
            System.out.println("Number is not Prime");
        } else {
            System.out.println("Number is Prime");
        }
    }
}
