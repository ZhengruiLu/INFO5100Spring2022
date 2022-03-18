package edu.zhengrui;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T> {
    private Queue<T> queue;
    public Object obj
    public ConcurrentQueue() {
        queue = new LinkedList<>();
    }

    public void add(T data){
        synchronized (obj.Lock){
            queue.add(data);
        }
    };
    public T remove(){};
    public T peek(){};
    public

}
