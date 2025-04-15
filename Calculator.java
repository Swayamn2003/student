public class Calculator {
    int a;
    int b;

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        
        int resultAdd = c1.add(10, 5);
        int resultSub = c1.sub(10, 5);
        int resultMul = c1.mul(10, 5);
        int resultDiv = c1.div(10, 5);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
        System.out.println("Multiplication: " + resultMul);
        System.out.println("Division: " + resultDiv);
    }
}
