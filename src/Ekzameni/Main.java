package Ekzameni;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Ekzameni ekzameni = new Ekzameni();
        Abiturienti abiturient = new Abiturienti();
        System.out.println( "Количество студентов зарегистрировавшихся на экзамены:" );
        Scanner kolichestvo =new Scanner(System.in);
        int a = kolichestvo.nextInt();
        System.out.println( "Введите данные студентов" );

        int i = 0;
  while ( i<=a-1) {    System.out.println( "Введите имя" );
        Scanner name =new Scanner(System.in);
        abiturient.setName( name.nextLine() );
        System.out.println( "Введите фамилию" );
        Scanner surname =new Scanner(System.in);
        abiturient.setSurname( surname.nextLine() );
        System.out.println( "Введите возраст" );
        Scanner age =new Scanner(System.in);
        abiturient.setAge( age.nextInt() );
        i++;
  }
        int d= 0;

  while (d<=abiturient.getStudenti().size())  {
        System.out.println( "Студент:"+ abiturient.getStudenti().get( d ) );
        System.out.println( "Поставьте оценку студенту по английскому"  );
        Scanner eng =new Scanner(System.in);
        ekzameni.setOcenkaEng( eng.nextInt() );
        System.out.println( "Поставьте оценку студенту по математике"  );
        Scanner mat =new Scanner(System.in);
        ekzameni.setOcenkaMatem( mat.nextInt() );
        System.out.println( "Поставьте оценку студенту по химии"  );
        Scanner him =new Scanner(System.in);
        ekzameni.setOcenkaHim( him.nextInt() );}

        ekzameni.spisok();

    }



}
