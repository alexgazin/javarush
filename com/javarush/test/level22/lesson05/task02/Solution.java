package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null)
            throw new TooShortStringException();
        if (string.equals(""))
            throw new TooShortStringException();
        int firstTabulation = string.indexOf("\t");
        if (firstTabulation == -1)
            throw new TooShortStringException();
        int secondTabulation = string.indexOf("\t", firstTabulation+1);
        if (secondTabulation == -1)
            throw new TooShortStringException();
        return string.substring(firstTabulation+1, secondTabulation);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
