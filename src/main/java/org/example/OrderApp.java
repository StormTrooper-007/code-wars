package org.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class OrderApp {
    public void performOrder(CyclicBarrier c){
        try{
            makeOrder();
            c.await();
            processOrder();
            c.await();
            readyOrder();
            c.await();
            shipOrder();
        }catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }

    }
    public void makeOrder(){
        System.out.println("i orderd somthing");
    }

    public void processOrder(){
        System.out.println("Processing your order");
    }

    public void readyOrder(){
        System.out.println("order ready");
    }

    public void shipOrder(){
        System.out.println("shipping order");
    }
}
