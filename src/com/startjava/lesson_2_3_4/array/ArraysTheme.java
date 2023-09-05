package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

public static void main(String[] args) {
        ementsReverse();
        ementsMultiplication();
        elementsDeletion();
        alphabetOutput();
        uniqueElementsCreate();
    }

    public static void ementsReverse() {
        System.out.println("Задание 1 Реверс значений массива");
        int[] arrayOne = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("До реверса: ");
        for (int a : arrayOne) {
            System.out.print(a + " ");
        }
        System.out.print("\nПосле реверса: ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(arrayOne[i] + " ");
        }
    }

    public static void ementsMultiplication() {
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

    public static void elementsDeletion() {
        System.out.println("\n\nЗадание 3 Удаление элементов массива");
        double[] arrayThree = new double[15];
        System.out.print("  Исходный массив: ");
        for (int i = 0; i < 15; i++) {
            double randomNumber = Math.random();
            arrayThree[i] = randomNumber;
            System.out.printf("%.3f ", randomNumber);
        }
        
        int centreCell = arrayThree.length / 2;
        int count = 0;
        for (int i = 0; i < 15; i++) {
            if (arrayThree[i] > arrayThree[centreCell]) {
                arrayThree[i] = 0;
                count++;
            }
        }
        System.out.print("\nИзмененный массив: ");
        for (double x : arrayThree) {
            System.out.print(String.format("%.3f ", x));
        }
        System.out.println("\nКоличество обнуленных ячеек = " + count + "\n");
    }


    public static void alphabetOutput() {
        System.out.println("\nЗадание 4 Вывод алфавита лесенкой");
        char[] arrayFour = new char[26];
        char z = 'Z';
        for (int i = 0; i < arrayFour.length; i++) {
            arrayFour[i] = z;
            z--;
        }
        int count = 1;
        for (char a : arrayFour) {
            for(int i = 0; i < count; i++) {
                System.out.print(arrayFour[i]);
            }
            count++;
            System.out.println();
        }
    }

    public static void uniqueElementsCreate() {
        System.out.println("\nЗадание 5 Заполнение массива уникальными числами");
        // создание массива
        int[] arrayFive = new int[30];
        for (int i = 0; i < arrayFive.length; i++) {
            arrayFive[i] = (int) (Math.random() * (40)) + 60;
        }
        //вывод созданного массива
        System.out.println("\nвывод созданного массива");
        int count = 0;
        for (int x : arrayFive) {
            System.out.print(x + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        //удаление дубликатов массива
        boolean b;
        do {
            b = false;
            for (int i = 0; i < arrayFive.length; i++) {
                for (int j = i + 1; j < arrayFive.length; j++) {
                    if (arrayFive[i] == arrayFive[j]) {
                        b = true;
                        arrayFive[j] = (int) (Math.random() * (40)) + 60;
                    }
                }
                if (b) {
                    break;
                }
            }
        } while (b);
        //сортировка массива
        for (int i = arrayFive.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrayFive.length - 1; j++) {
                if (arrayFive[j] > arrayFive[j + 1]) {
                    int temp = arrayFive[j];
                    arrayFive[j] = arrayFive[j + 1];
                    arrayFive[j + 1] = temp;
                }
            }
        }
        System.out.println("\nвывод массива по возрастанию без дубликатов");
        for (int x : arrayFive) {
            System.out.print(x + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
