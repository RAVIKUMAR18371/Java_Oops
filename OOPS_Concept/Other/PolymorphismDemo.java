package OOPS_Concept.Other;

public class PolymorphismDemo {

    // -------- BASE CLASS --------
    class Calculator {

        // Method Overloading (Same class)
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method to be overridden
        void showType() {
            System.out.println("I am a basic Calculator");
        }
    }

    // -------- INNER SUBCLASS --------
    class AdvancedCalculator extends Calculator {

        // Method Overriding (Same method, same parameters)
        @Override
        void showType() {
            System.out.println("I am an Advanced Calculator");
        }
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        PolymorphismDemo demo = new PolymorphismDemo();

        // Overloading demonstration
        Calculator calc = demo.new Calculator();
        System.out.println("Addition of 2 numbers: " + calc.add(10, 20));
        System.out.println("Addition of 3 numbers: " + calc.add(10, 20, 30));

        // Overriding demonstration
        Calculator advCalc = demo.new AdvancedCalculator();
        advCalc.showType();
    }
}
