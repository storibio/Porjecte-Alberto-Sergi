package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i == 0) {
            System.out.println("Menu:");
            Scanner opcio = new Scanner(System.in);
            int num = opcio.nextInt();
            //Opcio 0//
            if (num == 0) {
                i++;
            }
            //Opcio1//
            if (num == 1) {
                System.out.println("ee");
            }

        }
    }
}
