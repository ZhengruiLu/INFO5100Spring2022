package edu.zhengrui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int divideVal = Integer.MIN_VALUE;
        int a = 10;
        int b = 0;

        try {
            divideVal = divide(a, b);
        }catch (Exception exception){

        }

//        try{
//            System.out.println(divideVal);
//            File file = new File("NoFile.txt");
//            Scanner scanner = new Scanner(file);
//        }catch (ArithmeticException arithmeticException){
//            System.out.println(arithmeticException.getLocalizedMessage());
//            divideVal = 0;
//        }
//        catch (FileNotFoundException fileNotFoundException){
//            System.out.println("File not found");
//        }
//        finally {
//            System.out.println(divideVal);
//        }

    }

    private static int divide(int a, int b) throws Exception{
        return a/b;
    }


}
