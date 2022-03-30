package edu.zhengrui;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T> {
    private Queue<T> queue;
    private Object objLock = new Object();

    public ConcurrentQueue(){
        queue = new LinkedList<>();
    }

    public void add(T data) throws InterruptedException{
        synchronized (objLock){
            queue.add(data);
        }
    }

    public T remove() throws InterruptedException{
        T data;

        synchronized (objLock){
            data = queue.remove();
        }

        return data;
    }

    public T peek() throws InterruptedException{
        T data;

        synchronized (objLock){
           data = queue.peek();
        }

        return data;
    }

    public boolean isEmpty() throws InterruptedException{
        boolean isEmpty;

        synchronized (objLock){
            isEmpty = queue.isEmpty();
        }

        return isEmpty;
    }

}
