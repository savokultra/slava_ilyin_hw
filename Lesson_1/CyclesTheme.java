public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1: Подсчет суммы четных и нечетных чисел;");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\nЗадание 2: Вывод чисел в интервале (min и max) в порядке убывания;");
        int number1 = -1;
        int number2 = 10;
        int number3 = 5;
        int min = 0;
        int max = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1; 
        }
        if (number2 > number1 && number2 > number3) {
            max = number2; 
        }
        if (number3 > number1 && number3 > number2) {
            max = number3;
        }
        if (number1 < number2 && number1 < number3) {
            min = number1;
        }
        if (number2 < number1 && number2 < number3) {
            min = number2;
        }
        if (number3 < number1 && number3 < number2) {
            min = number3;
        }
        for (int i = --max; i > min; --i) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3: Вывод реверсивного числа и суммы его цифр;");
        int number = 1234;
        int numberCopy = number;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (numberCopy > 0) {
            System.out.print(numberCopy % 10);
            sum += numberCopy % 10;
            numberCopy /= 10;
        }
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\nЗадание 4: Вывод чисел на консоль в несколько строк;");
        //полуинтервал [1, 24) число 24 не включаем в полуинтервал
        int halfInterval = 24;
        for (int i = 1; i < halfInterval; i += 2) {
            System.out.printf("%3d", i);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        while (halfInterval % 10 != 0) {
            System.out.printf("%3d", 0);
            halfInterval += 2;
        }

        System.out.println("\n\nЗадание 5: Проверка количества двоек на четность/нечетность;");
        int number5 = 3242592;
        int number4 = number5;
        int twos = 0;
        int twosCount = 0;
        while (number4 > 0) { 
            twos = number4 % 10;
            number4 /= 10;
            if (twos == 2) {
                twosCount += 1;
            }
        }
        if (twosCount % 2 != 0) {
            System.out.println("Число " + number5 + " содержит нечетное количество двоек - " + 
                    twosCount);
        } else {
            System.out.println("Число " + number5 + " содержит четное количество двоек - " + 
                    twosCount);
        }

        System.out.println("\nЗадание 6: Отображение фигур в консоли;\n");
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println();
        int sharp = 0;
        int sharpCounter = 5;
        int copyCounter = sharpCounter;
        while (sharp < 15) {
            System.out.print("#");
            sharp++;
            if (sharp == sharpCounter) {
                System.out.println();
                sharpCounter += --copyCounter;
            }
        }
        System.out.println();
        int dollar = 1;
        int dollarCounter = 1;
        int copyDollar = dollarCounter;
        do {
            System.out.print("$");
            if (dollar == dollarCounter) {
                System.out.println();
                copyDollar++;
                dollarCounter += copyDollar;
            }
            dollar++;
        } while (dollar < 7);
        do {
            System.out.print("$");
            if (dollar == dollarCounter) {
                System.out.println();
            }
            dollar--;
            dollarCounter -= copyDollar;
        } while (dollar > 4);

        System.out.println("\n\nЗадание 7: Отображение ASCII-символов;");
        System.out.println("Dec Char");
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                char ch = (char) i;
                System.out.printf("%3d%5s%n", i, ch);
            }
        }
        System.out.println("\nDec Char");
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                char ch = (char) i;
                System.out.printf("%3d%5s%n", i, ch);
            }
        }

        // всё что ниже решение нашел на похожих задачах или отдельных фрагментах в сети
        System.out.println("\nЗадание 8: Проверка, является ли число палиндромом;");
        int palindrom = 1234321;
        int invertPalindrom = 0;
        int copyPalindrom = palindrom;
        while (copyPalindrom != 0) {
            invertPalindrom = invertPalindrom * 10 + copyPalindrom % 10;
            copyPalindrom = copyPalindrom / 10;
        }
        if (invertPalindrom == palindrom) {
            System.out.println("Число " + palindrom + " является палиндромом");
        } else {
            System.out.println("Число " + palindrom + " не является палиндромом");
        }

        System.out.println("\nЗадание 9: Определение, является ли число счастливым;");
        int happyNumber = 123321;
        int happyNumberClone = happyNumber;
        int happyNumberSum = 0;
        int countSum = 0;
        int countDevider = 10;
        int firstnumber = 0;
        while ((happyNumberClone / countDevider) > 1) {
            countDevider *= 10;
        }
        while (happyNumberClone > 1000) {
            happyNumberSum = happyNumberSum + happyNumberClone / countDevider; 
            firstnumber = happyNumberClone / countDevider;
            happyNumberClone = happyNumberClone - countDevider * firstnumber;
            countDevider /= 10;
        }
        while (happyNumberClone > 0) {
            countSum = countSum + happyNumberClone % 10;
            happyNumberClone = happyNumberClone / 10;
        }
        System.out.println("Сумма первых трёх цифр = " + happyNumberSum);
        System.out.println("Сумма последних трёх цифр = " + countSum);
        if (happyNumberSum == countSum) {
            System.out.println("Число " + happyNumber + " - счастливое число");
        } else {
            System.out.println("Число " + happyNumber + " - не счастливое число");
        }

        System.out.println("\nЗадание 10: Вывод таблицы умножения Пифагора;");
        System.out.println("\n          ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for (int s = 2; s < 10; s++) {
            System.out.printf("%4d", s);
        }
        System.out.print("\n____________________________________");
        System.out.println();
        for (int s = 1; s < 9; s++) {
            System.out.printf("%2d |", s + 1);
            for (int t = 1; t < 9; t++) {
            System.out.printf("%4d", (s + 1) * (t + 1));
            }
            System.out.println();
        }
    }
}