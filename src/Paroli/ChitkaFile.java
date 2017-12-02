package Paroli;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;


public class ChitkaFile {


    public static ArrayList<String> reader() throws Exception {

        LineNumberReader reader = new LineNumberReader( new FileReader( "F:/modul/src/Paroli/Passwords.csv" ) );
        String line = null;
        ArrayList<String> passwords = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            passwords.add( line );
        }
        return passwords;

    }
}


