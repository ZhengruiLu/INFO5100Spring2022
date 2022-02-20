package edu.zhengrui;

public class Main {
    public static void main(String[] args){
//        printFunction();
        Thread arr = new Thread(5);

        for (int i = 0; i < arr.length; i++) {

        }

        for (int i = 0; i < 100; i++) {
            Thread.currentThread().getName();
            System.out.println("Printing in the " + Thread.currentThread().getName() +" " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    private static float divide(int i, int j) throws Exception{
        return i / j;
//        float result = 0;
//        try{
//            result = i / j;
//        }catch (Exception ex){
//            System.out.println(ex.getLocalizedMessage());
//        }
//        return result;
    }

//    private static void printFunction(){
//
//    }
}
