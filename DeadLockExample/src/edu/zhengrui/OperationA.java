package edu.zhengrui;

public class OperationA implements Runnable{
    @Override
    public void run() {
        synchronized (Main.lockA){
            Main.queueA.add();
            try {

            }
        }
    }
}
