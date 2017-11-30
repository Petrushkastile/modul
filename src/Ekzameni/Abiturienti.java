package Ekzameni;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Abiturienti {
    private String name;
    private String surname;
    private int age;
    private String student;
    ArrayList<String> studenti=getStudenti();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getStudenti() {
        ArrayList<String> studenti = new ArrayList<>(  );
        String student = getName()+getSurname()+getAge();
        studenti.add(student);

       return studenti;
    }
}
