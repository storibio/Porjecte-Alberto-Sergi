package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;
        while (i==0){
            System.out.println("Menu:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //Opcio 0//
            if (num == 0){
                i++;
            }
            //Opcio1//
            if (num==1){
                int rows = sc.nextInt();
                int columns = sc.nextInt();
                int[][] array = new int[rows][columns];
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
        }
    }
}