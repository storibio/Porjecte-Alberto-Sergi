package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;
        int[][] array = new int[0][0];
        while (i==0){
            System.out.println("Menu:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //Opcio 0//
            if (num == 0){
                i++;
            }
            //Opcio1//
            else if (num==1) {
                int rows = sc.nextInt();
                int columns = sc.nextInt();
                array = new int[rows][columns];
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
            else if (num == 2) {
                int rows = sc.nextInt();
                int columns = sc.nextInt();
                columns--;
                rows--;
                array[rows][columns] = 1;
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
            else if (num == 6) {
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
        }
    }
}
