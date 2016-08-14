package com.javarush.test.level12.lesson09.task04;

/* Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }


    public class Human implements Run, Swim
    {
        @Override
        public void swim()
        {

        }

        @Override
        public void run() {
        }

    }

    public class Duck implements Fly, Swim, Run
    {

        @Override
        public void fly()
        {

        }

        @Override
        public void run()
        {

        }

        @Override
        public void swim()
        {

        }
    }

    public class Penguin implements Swim, Run
    {

        @Override
        public void run()
        {

        }

        @Override
        public void swim()
        {

        }
    }

    public class Airplane implements Fly, Run
    {

        @Override
        public void fly()
        {

        }

        @Override
        public void run()
        {

        }
    }
}
