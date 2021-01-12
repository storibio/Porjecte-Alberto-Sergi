package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int columns = 0;
        int rows = 0;
        double tasa = 1.5;
        double nunMalalts = 0;
        double nunMalalts2 = 0;
        int[][] array = new int[0][0];
        while (i == 0) {
            System.out.println("Menu:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //Opcio 0//
            if (num == 0) {
                i++;
            }
            //Opcio1//
            else if (num == 1) {
                rows = sc.nextInt();
                columns = sc.nextInt();
                array = new int[rows][columns];
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            } else if (num == 2) {
                System.out.println("Posicion del malalt/s");
                rows = sc.nextInt();
                columns = sc.nextInt();
                columns--;
                rows--;
                System.out.println("Numero de malalts");
                nunMalalts = (sc.nextDouble());
                nunMalalts2 = Math.floor(tasa * nunMalalts);
                nunMalalts = nunMalalts + nunMalalts2;
                array[rows][columns] = (int) nunMalalts;
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            } else if (num == 3) {
                System.out.println("Introduce la tasa");
                tasa = sc.nextDouble();
                for (int a = 0; a < array.length; a++) {
                    for (int j = 0; j < array[a].length; j++) {
                        int[][] arrayOld = array;
                        array[a][j] = arrayOld[a][j] + array[a][j] * (int) tasa;
                    }
                }
            } else if (num == 4) {
                System.out.println("Malalts curats");
                System.out.println("Quina opció? 1(global(tots els malalts)) 2(posicio concreta)");
                int opcio = sc.nextInt();
                if (opcio == 1) {
                    for (int a = 0; a < array.length; a++) {
                        for (int j = 0; j < array[a].length; j++) {
                            array[a][j] = 0;
                        }
                    }
                }
                if (opcio == 2) {
                    rows = sc.nextInt();
                    columns = sc.nextInt();
                    columns--;
                    rows--;
                    if (array[rows][columns] == 0) {
                        System.out.println("No tens cap malalt en aquesta posició");
                        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                    } else {
                        array[rows][columns] = 0;
                        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                    }
                }
            } else if (num == 6) {
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
        }
    }
}


