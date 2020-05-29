package com.practice.threading.join;

public class RunnableTask implements Runnable {

    private Number number;
    public RunnableTask(Number number) {
        this.number= number;
    }

    @Override
    public void run() {

            long fact = 1;
            for (int i = 1; i < number.getNumber() + 1; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fact = fact * i;
            }
            System.out.println(fact);
        }
}
