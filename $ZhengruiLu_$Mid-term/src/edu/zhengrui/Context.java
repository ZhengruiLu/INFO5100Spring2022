package edu.zhengrui;

public class Context {
    MathOperation operation;
    public Context(MathOperation operation) {
        this.operation = operation;
    }
    public int execute(int num1, int num2) {
        // Implement your code here
        return operation.performOperation(num1, num2);
    }
}
