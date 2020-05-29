package com.practice.threading.temp;

import java.util.concurrent.Callable;

public class OddEvenTask implements Runnable {

    private boolean isEvenThread;
    private int max;
    private Print print;

    public OddEvenTask(boolean isEvenThread, int max, Print print) {
        this.isEvenThread = isEvenThread;
        this.max = max;
        this.print = print;
    }


    @Override
    public void run() {
        int number = isEvenThread ? 2 : 1;

        for(int i = number; i <= max; i++){
            try {
                print.print(i, isEvenThread);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
