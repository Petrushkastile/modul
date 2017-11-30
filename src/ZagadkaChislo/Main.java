package ZagadkaChislo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int popitki = 5;
        Random random = new Random();
        int chislo = random.nextInt( (10) + 1 );
        System.out.println( "Угадай число" );


        for (int i = 0; i < popitki; i++) {
            Scanner ch = new Scanner( System.in );
            int a = ch.nextInt();
            if (a != chislo & a < chislo) {
                System.out.println( "Не угадали,загаданное число больше" );
            }
            if (a != chislo & a > chislo) {
                System.out.println( "Не угадали,загаданное число меньше" );
            }
            if (a == chislo) {
                System.out.println( "Угадали" );
            }

        }
            System.out.println( "Попытки закончились" );
        }
    }
