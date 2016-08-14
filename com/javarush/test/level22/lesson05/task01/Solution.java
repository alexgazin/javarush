package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int firstIndex = string.indexOf(" ") + 1;
        char[] chars = string.toCharArray();
        int countSpace = 0;
        int lastIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == ' ') {
                countSpace++;
                if (countSpace == 4)
                {
                    lastIndex = string.length();
                } else if (countSpace == 5) {
                    lastIndex = i;
                    break;
                }
            }
        }
        if (countSpace < 4) {
            throw new TooShortStringException();
        }
        return string.substring(firstIndex, lastIndex);
    }

    public static void main(String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static class TooShortStringException extends RuntimeException
    {
    }
}
