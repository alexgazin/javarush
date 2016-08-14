package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileInputStream file1 = new FileInputStream(sc.nextLine());
        FileOutputStream file2 = new FileOutputStream(sc.nextLine());
        FileOutputStream file3 = new FileOutputStream(sc.nextLine());
        sc.close();
        int f1Size = file1.available();
        int halfCount = f1Size / 2 + f1Size % 2;
        for (int i = 0; i < halfCount; i++) {
            file2.write(file1.read());
        }
        for (int i = halfCount; i < f1Size; i++) {
            file3.write(file1.read());
        }
        file1.close();
        file2.close();
        file3.close();
    }
}
