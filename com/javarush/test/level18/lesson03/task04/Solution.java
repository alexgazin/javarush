package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (stream.available() > 0) {
            list.add(stream.read());
        }

        Collections.sort(list);

        for (int  i = 0; i < list.size() - 1; i++ ) {
           if (list.get(i).equals(list.get(i + 1))) {
               list.remove(i);
               i--;
           }
        }
        for (Integer i : list) {
            System.out.println(i + " ");
        }
    }
}
