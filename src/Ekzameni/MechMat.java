package Ekzameni;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class MechMat {
    private ArrayList<String> studentiM = new ArrayList<>();
    private ArrayList<String> reiting = new ArrayList<>();
    private int ocenkaP;
    private int ocenkaM;
    private int ocenkaC;
    private double sredniyBal;
    private final double PROHODNOIBAL = 4.20;

    public enum Ekzameni {
        PHYSICS( "Физика:" ),
        MATHEMATICS( "Математика:" ),
        COMPUTERSCIENCE( "Информатика:" ),;

        Ekzameni(String s) {
        }
    }

    public int getOcenkaM() {
        return ocenkaM;
    }

    public void setOcenkaM(int ocenkaM) {
        this.ocenkaM = ocenkaM;
    }

    public int getOcenkaC() {
        return ocenkaC;
    }

    public void setOcenkaC(int ocenkaC) {
        this.ocenkaC = ocenkaC;
    }

    public void setSredniyBal(int sredniyBal) {
        this.sredniyBal = sredniyBal;
    }

    public void addStud(String student) {
        studentiM.add( student );
    }

    public int getOcenkaP() {
        return ocenkaP;
    }

    public void setOcenkaP(int ocenkaP) {
        this.ocenkaP = ocenkaP;
    }

    public double getSredniyBal() {
        double sum = ocenkaP + ocenkaC + ocenkaM;

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
        for (String stud : studentiM) {
            System.out.println( "Абитуриент: " + stud );
            System.out.println( "Выставьте оценку за " + Ekzameni.PHYSICS );
            setOcenkaP( ocenka.nextInt() );
            System.out.println( "Выставьте оценку за " + Ekzameni.COMPUTERSCIENCE );
            setOcenkaC( ocenka.nextInt() );
            System.out.println( "Выставьте оценку за " + Ekzameni.MATHEMATICS );
            setOcenkaM( ocenka.nextInt() );
            String s = Double.toString( getSredniyBal() );
            reiting.add( stud + " Средний балл: " + getSredniyBal() + " " + kriteriy() );
        }

    }

    public void spisok() {
        for (String stud : reiting) {
            System.out.println( stud );
        }
    }
}
