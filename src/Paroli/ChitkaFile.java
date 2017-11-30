package Paroli;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Properties;

public class ChitkaFile {


    public static ArrayList<String> reader() throws Exception {

        LineNumberReader reader = new LineNumberReader( new FileReader( "F:/modul/src/Paroli/Passwords.csv" ) );
        String line = null;
        ArrayList<String> passwords = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            passwords.add( line );}
    return passwords;
    }

    public ArrayList<String> getPass() throws Exception {
        ArrayList<String>pass=new ArrayList<>(  );

        for(int i = 1; i<reader().size(); i++){
            String[]parse = reader().get(i).split( " " );
            String password = parse[1];
            pass.add( password );
        }
    return  pass;
    }


}


