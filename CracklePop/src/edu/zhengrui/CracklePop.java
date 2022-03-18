package edu.zhengrui;

public class CracklePop {
    private int num;

    CracklePop(int num){
        this.num = num;
    }

    public void printCracklePop(){
        for (int i = 0; i < 100; i++) {
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("CracklePop");
            }else if (num % 3 == 0){
                System.out.println("Crackle");
            }else if (num % 5 == 0){
                System.out.println("Pop");
            }else{
                System.out.println(num);
            }
            num++;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
