package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by pr0jector on 05.06.2016.
 */
public class Hippodrome
{
    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        game.getHorses().add(new Horse("One", 3,0));
        game.getHorses().add(new Horse("Two", 3,0));
        game.getHorses().add(new Horse("Three", 3,0));
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(200);
            move();
            print();


        }
    }

    public void print() {
        for (Horse horse  : getHorses()) {
            horse.print();
            System.out.println();
            System.out.println();
        }
    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }

    public void printWinner() {

        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
