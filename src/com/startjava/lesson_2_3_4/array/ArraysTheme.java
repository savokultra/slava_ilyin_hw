package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

    public static void taskOne() {
        System.out.println("Задание 1 Реверс значений массива");
        int[] arrayOne = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("До реверса: ");
        for (int a : arrayOne) {
            System.out.print(a + " ");
        }
        System.out.print("\nПосле реверса: ");
        for (int i = 6; i >= 0; --i) {
            System.out.print(arrayOne[i] + " ");
        }
    }

    public static void taskTwo() {
        System.out.println("\n\nЗадание 2 Произведение элементов массива");
        int sum = 1;
        int[] arrayTwo = new int[10];
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = i;
        }
        for (int i : arrayTwo) {
            if (i > 0 && i < 9) {
                sum*= i;
                char ch = i < 8 ? '*' : '=';
                System.out.print(i + " " + ch + " ");
            }
        }
        System.out.print(sum);
    }

    public static void taskThree() {
        System.out.println("\n\nЗадание 3 Удаление элементов массива");
        double[] arrayThree = new double[15];
        for (int i = 0; i < 15; i++) {
            double randomNumber = Math.random();
            arrayThree[i] = randomNumber;
            System.out.printf(i + "%5.2f%n", + randomNumber);
        }
        int cell = arrayThree.length / 2;
        System.out.println("\nсредняя ячейка = " + cell);
        System.out.printf("arrayThree[cell] = " + "%5.2f%n", + arrayThree[cell]);
        for (int i = 0; i < 15; i++) {
            if (arrayThree[i] > arrayThree[cell]) {
                arrayThree[i] = 0;
                System.out.printf(i + "%5.2f%n", + arrayThree[i]);
            }
        }
        for (double x : arrayThree) {
            System.out.print(\nString.format("%.2f", x) + " ");
            //https://javarush.com/groups/posts/1412-formatiruem-vihvod-chisel-v-java
            /*
            DecimalFormat dF = new DecimalFormat( "#.###" );
double value = 72.224463;
System.out.print(dF.format(value));/*
             */
        }
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
    }
}
