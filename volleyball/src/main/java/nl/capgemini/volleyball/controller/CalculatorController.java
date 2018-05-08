package nl.capgemini.volleyball.controller;



import nl.capgemini.volleyball.utils.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private Calculator calculator;      //to mock it you need to use the interface



    public int add(int a, int b){
        return this.calculator.add(a,b);
    }


    public int subtract(int a, int b){
        return this.calculator.subtract(a,b);
    }

    public int multiply(int a, int b){
        return this.calculator.multiply(a,b);
    }

    public int wholeDevide(int a, int b){
        return this.calculator.wholeDivide(a,b);
    }


}
