package Ekzameni;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Chemical {
    private ArrayList<String> studentiC = new ArrayList<>();
    private ArrayList<String> reiting = new ArrayList<>();
    private int ocenkaH;
    private int ocenkaM;
    private int ocenkaC;
    private double sredniyBal;
    private final double PROHODNOIBAL = 3.90;

    private enum Ekzameni {
        СHEMISTRY( "Химия:" ),
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
        studentiC.add( student );
    }

    public int getOcenkaH() {
        return ocenkaH;
    }

    public void setOcenkaH(int ocenkaH) {
        this.ocenkaH = ocenkaH;
    }

    public double getSredniyBal() {
        double sum = ocenkaH + ocenkaC + ocenkaM;

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
        for (String stud : studentiC) {
            System.out.println( "Абитуриент: " + stud );
            System.out.println( "Выставьте оценку за " + Ekzameni.СHEMISTRY );
            setOcenkaH( ocenka.nextInt() );
            System.out.println( "Выставьте оценку за " + Ekzameni.COMPUTERSCIENCE );
            setOcenkaC( ocenka.nextInt() );
            System.out.println( "Выставьте оценку за " + Ekzameni.MATHEMATICS );
            setOcenkaM( ocenka.nextInt() );
            String s = Double.toString( getSredniyBal() );
            reiting.add( stud + " Средний балл: " + getSredniyBal() + " " + kriteriy() );
        }

    }

    public void spisok(){
        for (String stud : reiting) {
            System.out.println( stud );
        }
    }
}
