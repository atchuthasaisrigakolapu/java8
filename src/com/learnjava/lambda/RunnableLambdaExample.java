package com.learnjava.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();
        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();
        Runnable runnableLambda2 = ()->System.out.println("Inside Runnable 3");
        new Thread(runnableLambda2).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 4");
            }
        }).start();
        new Thread(()->System.out.println("Inside Runnable 5")).start();
    }


    //Runnable getRunnableLambda2 = () -> System.out.println("Inside Runnable 3");

}
