package nl.capgemini.volleyball.utils;


import org.springframework.stereotype.Component;

@Component              //means i can autowire it
public class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int wholeDivide(int a, int b) {
        if (b != 0 && a % b == 0) {
            return a / b;
        } else {
            return 0;
        }
    }

//    public double divide(double a, double b) {   //cannot use the test using double..
//        if (b != 0) {
//            return a / b;
//        } else {
//            return 0;
//        }
//    }
}



