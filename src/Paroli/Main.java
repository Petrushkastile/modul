package Paroli;

import java.util.*;

//Дан файл  с логинами и паролями. Найдите топ10 самых популярных паролей.

public class Main {

    public static void main(String[] args) throws Exception {
        ChitkaFile chitka = new ChitkaFile();

        ArrayList<String> pass = new ArrayList<>();

        for (int i = 1; i < chitka.reader().size(); i++) {
            String[] parse = chitka.reader().get( i ).split( "[,;:.!?\\s]+" );
            pass.add( parse[1] );
        }

        HashMap<String, Integer> paroli = new HashMap<String, Integer>();
        Integer item;
        for (String par : pass) {
            item = paroli.get( par );
            if (item == null) paroli.put( par, 1 );
            else paroli.put( par, item + 1 );
        }

        List list = new ArrayList( paroli.entrySet() );
        Collections.sort( list, new Comparator() {
            public int compare(Object o1, Object o2) {
                Map.Entry e2 = (Map.Entry) o2;
                Map.Entry e1 = (Map.Entry) o1;
                Comparable c2 = (Comparable) e2.getValue();
                Comparable c1 = (Comparable) e1.getValue();

                return c2.compareTo( c1 );
            }
        } );

        System.out.println( "Топ 10 самых популярных паролей:" );
        for (int i = 0; i < 10; i++) {
            System.out.println( list.get( i ) );
        }
    }
}






