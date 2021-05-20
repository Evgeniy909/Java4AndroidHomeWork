package FirstLesson;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //______________________________________________первое задание

        Random rnd = new Random();
        boolean goGame = false;

        int randomNumber;
        int inputNumber;
        Scanner scan = new Scanner(System.in);

        do {
            //Загадываем число
            randomNumber = rnd.nextInt(10);

            for (int n = 0; n < 3; n++) {
                System.out.println("Угадайте число:");

                inputNumber = scan.nextInt();

                if (inputNumber == randomNumber) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (inputNumber > randomNumber & n <2) {
                    System.out.println("Загаданное число меньше!");
                } else if(inputNumber < randomNumber & n <2) {
                    System.out.println("Загаданное число больше!");
                }
            }
            //правильное число
            System.out.println("Правильное число " + randomNumber);

            System.out.println("Желаете попробовать еще раз?");
            System.out.println("Для продолжения введите 1, для выхода 0");

            inputNumber = scan.nextInt();

            if (inputNumber == 1) {
                goGame = true;
            } else if (inputNumber == 0) {
                goGame = false;
            }

        } while (goGame);
        scan.close();
    }
}