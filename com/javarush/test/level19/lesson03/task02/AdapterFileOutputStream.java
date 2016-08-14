package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {

    private FileOutputStream out;

    public AdapterFileOutputStream(FileOutputStream out) {
        this.out = out;
    }

    @Override
    public void flush() throws IOException
    {
        this.out.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        this.out.write(s.getBytes());
    }

    @Override
    public void close() throws IOException
    {
        this.out.close();
    }
}

