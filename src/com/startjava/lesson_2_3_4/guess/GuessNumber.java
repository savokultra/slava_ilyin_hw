package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player[] players = new Player[3];
    private int hiddenNumber;
    private Scanner sc = new Scanner(System.in);

    public GuessNumber(String[] names) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        generateHiddenNumber();
        startGameplay();
        clear();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private void startGameplay() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        boolean b = true;
        while (b) {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            for (Player x : players) {
                if (isGuessed(x)) {
                    b = false;
                    break;
                }
            }
        }
        showPlayerNumbers(players);
    }

    private boolean isGuessed(Player player) {
        if (player.getAttempt() < 10) {
            inputNumber(player);
            if (player.getNumber() == hiddenNumber) {
                System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " +
                        player.getAttempt() + " попытки");
                return true;
            }
            System.out.println("\nЧисло " + (player.getNumber() < hiddenNumber ? player.getNumber() +
                    " меньше" : player.getNumber() + " больше") + " загаданного компьютером");
            return checkAttempt(player);
        }
        return false;
    }

    private void inputNumber(Player player) {
        int number;
        do {
            System.out.print("\nИгрок " + player.getName() + " введите число от 1 до 100: ");
            number = sc.nextInt();
        } while (player.addNumber(number));
    }

    private boolean checkAttempt(Player player) {
        if (player.getAttempt() > 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return players[2].getAttempt() > 9;
        }
        return false;
    }

    private void showPlayerNumbers(Player[] players) {
        for (Player player : players) {
            System.out.print("\nИгрок " + player.getName() + " загадал числа: ");
            int[] numbers = player.getAllNumbers();
            for (int number : numbers) {
                System.out.printf("%s ", number);
            }
        }
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }
}
