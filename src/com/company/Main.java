package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int[][] array;
        int inputrow = 0;
        int inputcol = 0;
        int replace = 0;
        while (i == 0) {
            System.out.println("Menu:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //Opcio 0//
            if (num == 0) {
                i++;
            }
            //Opcio1//
            if (num == 1) {
                int rows = sc.nextInt();
                int columns = sc.nextInt();
                array = new int[rows][columns];
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
            //Opcio2//
            if (num == 2) {
                int rows = sc.nextInt();
                int columns = sc.nextInt();
                array = new int[rows][columns];
                System.out.println("Enter Row: ");
                inputrow = sc.nextInt();
                System.out.println("Enter Cols:");
                inputcol = sc.nextInt();
                System.out.println("Enter New Number: ");
                replace = 1;
                array[inputrow][inputcol] = replace;
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
            //Opcio 0//
            if (num == 0) {
                i++;
            }
        }
    }
}