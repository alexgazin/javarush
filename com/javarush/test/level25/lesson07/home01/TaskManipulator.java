package com.javarush.test.level25.lesson07.home01;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    private Thread thread;

    @Override
    public void run() {
        while (!thread.isInterrupted()) {
            try {
                Thread.sleep(0);
                System.out.println(thread.getName());
                Thread.sleep(90);
            } catch (Exception ignored) {
                break;
            }
        }
    }

    @Override
    public void start(String threadName)
    {
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void stop()
    {
        thread.interrupt();
    }
}
