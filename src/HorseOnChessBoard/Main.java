package HorseOnChessBoard;
//Ход коня по шахматной доске.Вводиться текущее положение коня и клетка в которую пробуют его передвинуть

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Введите начальное положение шахматной фигуры" );
        int gorizont = 0;
        int vertikal = 0;
        while (gorizont > 104 || gorizont < 97 || vertikal > 56 || vertikal < 49) {
            Scanner scanxy = new Scanner( System.in );
            String pologenie = scanxy.nextLine();
            char[] kletka = pologenie.toCharArray();
            gorizont = Character.valueOf( kletka[0] );
            vertikal = Character.valueOf( kletka[1] );

            if (gorizont > 104 || gorizont < 97 || vertikal > 56 || vertikal < 49) {
                System.out.println( "Вы вышли за предел доски,установите фигуру в поле" );
            }
        }

        Integer[] polog = {gorizont, vertikal};

        System.out.println( "Куда будем ходить?" );


        int hodGor = 0;
        int hodVer = 0;
        while (hodGor > 104 || hodGor < 97 || hodVer > 56 || hodVer < 49) {
            Scanner hodk = new Scanner( System.in );
            String hod = hodk.nextLine();
            char[] hodi = hod.toCharArray();
            hodGor = Character.valueOf( hodi[0] );
            hodVer = Character.valueOf( hodi[1] );
            if (hodGor > 104 || hodGor < 97 || hodVer > 56 || hodVer < 49) {
                System.out.println( "Вы вышли за предел доски, введите свой ход:" );
            }
        }

        Integer[] hodK = {hodGor, hodVer};

        int prav1 = Math.abs( hodK[0] - polog[0] );
        int prav2 = Math.abs( hodK[1] - polog[1] );

        if (prav1 != 1 || prav2 != 2) {
            if (prav1 != 2 || prav2 != 1) {
                System.out.println( "Ход невозможен" );
            } else System.out.println( "Ход возможен" );
        } else System.out.println( "Ход возможен" );

    }
}

