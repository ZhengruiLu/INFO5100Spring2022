/*
byte
short
int
long
float
double
boolean
char

 */

public class Main {
    public static void main(String[] args){

    }

    private static float cla(float baseSalary, int dependents){
        float salary = 0;
        switch (dependents){
            case 0:
                System.out.println("0 dependents");
                salary = baseSalary - baseSalary * 0.4f;
                break;
            case 1:
            case 2:
                System.out.println("1 or 2 dependents");
                salary = baseSalary - baseSalary * 0.2f;
                break;
        }
    }

    private static void forEachLoop(String[] names){
        for (String name : names) {
            System.out.println("name" + name);
        }
    }

    private static void whileLoop(String[] names){
        int i = 0;
        while (i < names.length){
            System.out.println("Value of i = " + i);
            System.out.printf("");
        }
    }

}
