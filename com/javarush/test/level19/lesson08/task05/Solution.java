package com.javarush.test.level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
       //
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        PrintStream realStream = System.out;

        ByteArrayOutputStream fakeText = new ByteArrayOutputStream();

        PrintStream fakeStream = new PrintStream(fakeText);
        System.setOut(fakeStream);

        testString.printSomething();

        FileOutputStream fileInputStream = new FileOutputStream(rd.readLine());
        String fake = fakeText.toString();

        fileInputStream.write(fake.getBytes());


        System.setOut(realStream);
        System.out.println(fake);
        rd.close();
        fileInputStream.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

