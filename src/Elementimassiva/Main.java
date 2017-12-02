package Elementimassiva;

import java.lang.reflect.Array;

//Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
public class Main {
    public static void main(String[] args) {
        Integer[] chisla = {1, 4, 5, 1, 1, 3};

        int countUnique = 0;
        int count = 0;

        for (int i = 0; i < chisla.length; i++) {
            countUnique++;
            for (int j = i + 1; j < chisla.length; j++) {
                if (chisla[j] == chisla[i]) {
                    count++;
                    break;
                }
            }
        }
        int result = countUnique - count;
        System.out.println( result );
    }
}
