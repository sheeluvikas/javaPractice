package com.practice.threading;

public class OddEvenTask implements Runnable {

    private int maxNumber;
    private boolean isEvenThread;
    private Print print;

    public OddEvenTask(Print print, int maxNumber, boolean isEvenThread){
        this.maxNumber = maxNumber;
        this.isEvenThread = isEvenThread;
        this.print = print;
    }

    @Override
    public void run() {
        int number = isEvenThread ? 2 : 1;

        while(number <= maxNumber) {
            if(isEvenThread){
                try {
                    print.printEven(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                try {
                    print.printOdd(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            number = number + 1;
        }


    }
}
