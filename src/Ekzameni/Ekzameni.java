package Ekzameni;

import java.util.ArrayList;

public class Ekzameni {
    Abiturienti abiturient =new Abiturienti();
    private int ocenkaEng;
    private int ocenkaHim;
    private int ocenkaMatem;
    private int sredniy;
    private ArrayList<String> sredniyBal=getSrednieBali();
    private String fakultet;

   public int getSredniy(){
       sredniy = (getOcenkaEng()+getOcenkaHim()+getOcenkaMatem())/3;
       return sredniy;
   }
    public int getOcenkaEng() {
        return ocenkaEng;
    }

    public int getOcenkaHim() {
        return ocenkaHim;
    }

    public void setOcenkaHim(int ocenkaHim) {
        this.ocenkaHim = ocenkaHim;
    }

    public int getOcenkaMatem() {
        return ocenkaMatem;
    }

    public void setOcenkaMatem(int ocenkaMatem) {
        this.ocenkaMatem = ocenkaMatem;
    }

    public ArrayList<String> getSredniyBal() {
        return sredniyBal;
    }

    public void setSredniyBal(ArrayList<String> sredniyBal) {
        this.sredniyBal = sredniyBal;
    }

    public void setOcenkaEng(int ocenka) {
        this.ocenkaEng = ocenka;
    }

    public String getFakultet() {
       if (getSredniy()<10){fakultet = "Математический";}
       if (getSredniy()<5){fakultet="Английский";}
       if (getSredniy()<4){fakultet="Химический";}

       return fakultet;
    }
    public ArrayList<String> getSrednieBali() {
        ArrayList<String> sredniyBal = new ArrayList<>(  );

        String sredniy = abiturient.getName()+abiturient.getSurname()+getSredniy()+getFakultet();
         sredniyBal.add(sredniy);
        return sredniyBal;
    }

    public void spisok(){
       System.out.println( "Список студентов и их распределение по факультетам" );
       for (int a=0;a<getSrednieBali().size();a++){
           System.out.println( getSrednieBali().get( a ) );
       }
    }
}