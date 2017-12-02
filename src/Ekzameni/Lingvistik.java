package Ekzameni;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Lingvistik {
    private int ocenkaV;
    private int ocenkaG;
    private int ocenkaR;
    private double sredniyBal;
    private final double PROHODNOIBAL=4.00;
    private ArrayList<String> studentiL = new ArrayList<>();
    private ArrayList<String> reiting = new ArrayList<>();

    private  enum Ekzameni {
        VOCABULARY("Лексика:"),
        GRAMMAR("Грамматика:"),
        READING("Чтение:");

        Ekzameni(String s) {

        }
    }

   public int getOcenkaR() {
        return ocenkaR;
    }

    public void setOcenkaR(int ocenkaR) {
        this.ocenkaR = ocenkaR;
    }

    public int getOcenkaG() {
        return ocenkaG;
    }

    public void setOcenkaG(int ocenkaG) {
        this.ocenkaG = ocenkaG;
    }

    public void setSredniyBal(int sredniyBal) {
        this.sredniyBal = sredniyBal;
    }

    public int getOcenkaV() {
        return ocenkaV;
    }

    public void setOcenkaV(int ocenkaV) {
        this.ocenkaV = ocenkaV;
    }

    public double getSredniyBal() {
        double sum = ocenkaG + ocenkaR + ocenkaV;

        return sredniyBal = new BigDecimal( sum / 3 ).setScale( 2, RoundingMode.HALF_UP ).doubleValue();
    }

    public String kriteriy() {
        String kriteriy = null;
        if (sredniyBal < PROHODNOIBAL) {
            kriteriy = "Не зачислен";
        }
        if (sredniyBal > PROHODNOIBAL) {
            kriteriy = "Зачислен";
        }
        return kriteriy;
    }

    public void addOcenki() {
        Scanner ocenka = new Scanner( System.in );
        for (String stud : studentiL) {
            System.out.println( "Абитуриент: " + stud );
            System.out.println( "Выставьте оценку за"+Ekzameni.GRAMMAR );
            setOcenkaR( ocenka.nextInt() );
            System.out.println( "Выставьте оценку за"+Ekzameni.READING );
            setOcenkaG( ocenka.nextInt() );
            System.out.println( "Выставьте оценку за"+Ekzameni.VOCABULARY );
            setOcenkaV( ocenka.nextInt() );
            String s = Double.toString( getSredniyBal() );
            reiting.add( stud + " Средний балл: " + getSredniyBal() + " " + kriteriy() );
        }

    }

    public void addStud(String student) {

        studentiL.add( student );
    }
    public void spisok(){
        for (String stud : reiting) {
            System.out.println( stud );
        }
    }
}
