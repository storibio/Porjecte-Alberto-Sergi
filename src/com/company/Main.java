package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int column = 0;
        int row = 0;
        double tasa = 1.5;
        double nunMalalt = 0;
        double nunMalalt2 = 0;
        int[][] array = new int[0][0];
        while (i == 0) {
            System.out.println("Tasa actual:" + tasa);
            System.out.printf("%15s %n %s %n %s %n %s %n %s %n %s %n %s %n %s %n", "MENU","1)Crear taula","2)Afegir malalts", "3)Actualitzar la taxa","4)Curar malalts","5)Moure malalts", "6)Mostra taula","0)Sortir");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //Opcio 0//
            if (num == 0) {
                i++;
            }
            //Opcio1//
            else if (num == 1) {
                System.out.println("Dimensions de la taula");
                row = sc.nextInt();
                column = sc.nextInt();
                array = new int[row][column];
                String [] [] arrayMostrar = new String[row][column];
                System.out.println(Arrays.deepToString(arrayMostrar).replace("], ", "]\n").replace("[[", "[").replace("]]", "]").replace("null","0"));

            } else if (num == 2) {
                System.out.println("Posicion del malalt/s");
                row = sc.nextInt();
                column = sc.nextInt();
                column--;
                row--;
                System.out.println("Numero de malalts");
                nunMalalt = (sc.nextDouble());
                nunMalalt2 = Math.floor(tasa * nunMalalt);
                nunMalalt = nunMalalt + nunMalalt2;
                array[row][column] = (int) nunMalalt;
                //Opcio3//
            } else if (num == 3) {
                System.out.println("Introduce la tasa");
                tasa = sc.nextDouble();
                for (int a = 0; a < array.length; a++) {
                    for (int j = 0; j < array[a].length; j++) {
                        int[][] arrayOld = array;
                        array[a][j] = arrayOld[a][j] + array[a][j] * (int) tasa;
                    }
                }
                //Opcio4//
            } else if (num == 4) {
                System.out.println("Malalts curats");
                System.out.println("Quina opció? \n 1(global(tots els malalts)) \n " +
                        "2(posicio concreta) \n " +
                        "3(Global(Percentatge) \n"  +
                        "4(Global (Random) ");
                int opcio = sc.nextInt();
                if (opcio == 1) {
                    System.out.println("Número de curats");
                    int curats = sc.nextInt();
                    for (int a = 0; a < array.length; a++) {
                        for (int j = 0; j < array[a].length; j++) {
                            array[a][j] = array[a][j] - curats;
                        }
                    }
                }
                if (opcio == 3)
                    System.out.println("Número de curats");
                int curats = sc.nextInt();
                System.out.println("Quin percentatge vols aplicar");
                int percent = sc.nextInt();
                for (int a = 0; a < array.length; a++) {
                    for (int j = 0; j < array[a].length; j++) {
                        array[a][j] = array[a][j] - (array[a][j] * percent / 100);
                    }
                }
                if (opcio == 2) {
                    System.out.println("Filas i Columna");
                    row = sc.nextInt();
                    column = sc.nextInt();
                    System.out.println("Número de curats");
                    int curar = sc.nextInt();
                    column--;
                    row--;
                    if (array[row][column] == 0) {
                        System.out.println("No tens cap malalt en aquesta posició");
                        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                    } else {
                        array[row][column] = array[row][column] - curar;
                        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                    }
                }
                if (opcio == 4) {
                    System.out.println("Número de curats");
                    double random = Math.random() * 10;
                    for (int a = 0; a < array.length; a++) {
                        for (int j = 0; j < array[a].length; j++) {
                            array[a][j] = array[a][j] - (int) random;
                            System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                        }
                    }
                }
                //Opcio5//
            } else if (num == 5) {
                System.out.println("Posició dels malalts que vols moure");
                row = sc.nextInt();
                column = sc.nextInt();
                column--;
                row--;
                System.out.println("Comandes: q (dalt esquerra), w (dalt mig), e (dalt dreta), a (esquerra mig), d (dreta mig), z (baix esquerra), x (baix mig), c (baix dreta)");
                int value = array[row][column];
                String move = sc.next();
                switch (move) {
                    case "W":
                    case "w":
                        array [row][column] = 0;
                        array [--row][column] =value;
                        break;
                    case "q":
                    case "Q":
                        array [row][column] = 0;
                        array [--row][--column] =value;
                        break;
                    case "E":
                    case "e":
                        array [row][column] = 0;
                        array [--row][++column] =value;
                        break;
                    case "A":
                    case "a":
                        array [row][column] = 0;
                        array [row][--column] =value;
                        break;
                    case "d":
                    case "D":
                        array [row][column] = 0;
                        array [row][++column] =value;
                        break;
                    case "z":
                    case "Z":
                        array [row][column] = 0;
                        array [++row][--column] =value;
                        break;
                    case "x":
                    case "X":
                        array [row][column] = 0;
                        array [++row][column] =value;
                        break;
                    case "c":
                    case "C":
                        array [row][column] = 0;
                        array [++row][++column] =value;
                        break;
                }
            } else if (num == 6) {
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
        }
    }
}
