package Ekzameni;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MechMat mechMat = new MechMat();
        Lingvistik lingvistik = new Lingvistik();
        Chemical chemical = new Chemical();


        Scanner vibor = new Scanner( System.in );
        Scanner names = new Scanner( System.in );
        Scanner surnames = new Scanner( System.in );
        Scanner ages = new Scanner( System.in );

        System.out.println( "Факультеты: " + '\n' + "[1]Физико-математический " + '\n' + "[2]Лингвистики " + '\n' + "[3]Химический" + '\n' + "[4]Закончить распределение" + '\n' );

        int i = 0;
        while (i != 4) {
            System.out.println( "Выберите номер факультета!" );
            i = vibor.nextInt();
            switch (i) {
                case 1:
                    System.out.println( "Введите имя,фамилию,возраст" );
                    mechMat.addStud( String.valueOf( new Abiturient( names.next(), surnames.next(), ages.nextInt() ) ) );

                    break;
                case 2:
                    System.out.println( "Введите имя,фамилию,возраст" );
                    lingvistik.addStud( String.valueOf( new Abiturient( names.next(), surnames.next(), ages.nextInt() ) ) );
                    break;
                case 3:
                    System.out.println( "Введите имя,фамилию,возраст" );
                    chemical.addStud( String.valueOf( new Abiturient( names.next(), surnames.next(), ages.nextInt() ) ) );
                    break;
            }
        }

        System.out.println( "Выставление оценок по экзаменам:" );
        System.out.println( "Факультеты: " + '\n' + "[1]Физико-математический " + '\n' + "[2]Лингвистики " + '\n' + "[3]Химический" + '\n' + "[4]Закончить выставление оценок" + '\n' );
        int a = 0;
        while (a != 4) {
            System.out.println( "Выберите номер факультета!" );
            a = vibor.nextInt();
            switch (a) {
                case 1:
                    mechMat.addOcenki();
                    break;
                case 2:
                    lingvistik.addOcenki();
                    break;
                case 3:
                    chemical.addOcenki();
                    break;
            }
        }

        System.out.println( "Списки абитуриентов с итоговым средним баллом по факультетам: " );
        System.out.println( '\n'+"Физико-математический:" + '\n' );
        mechMat.spisok();
        System.out.println( '\n'+"Лингвистический:" + '\n' );
        lingvistik.spisok();
        System.out.println( '\n'+"Химический:" + '\n' );
        chemical.spisok();

    }

}
