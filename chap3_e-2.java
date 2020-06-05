package com.company;

import java.util.Scanner;

public class ex2 {

        public static void main (String args[]){
            int []num = new int[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("정수 10개 입력");

            for (int i =0; i<10; i++){
                num[i] = num[i] + sc.nextInt();
                if(num[i] % 3 ==0 )
                System.out.print(num[i] + " ");
            }

        }
    }



