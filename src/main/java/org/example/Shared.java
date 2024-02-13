package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shared {
    public int j = 0;

    Lock lock =  new ReentrantLock();

    public void produce() {
        try{
            System.out.println(lock.tryLock());
            j++;
            System.out.println("increased number to " + j);
        }finally {
            lock.unlock();
        }
    }

    public void consume(){
        try{
            System.out.println(lock.tryLock());
            System.out.println(  "got -> " + j);
        }finally {
            lock.unlock();
        }
    }
}
