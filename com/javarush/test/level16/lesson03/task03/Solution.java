package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

        SpecialThread st = new SpecialThread();
        SpecialThread st1 = new SpecialThread();
        SpecialThread st2 = new SpecialThread();
        SpecialThread st3 = new SpecialThread();
        SpecialThread st4 = new SpecialThread();

        list.add(new Thread(st));
        list.add(new Thread(st1));
        list.add(new Thread(st2));
        list.add(new Thread(st3));
        list.add(new Thread(st4));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
