/*
 * Implements a minicomputer
 * 
 */
package MiniCalculator;

/**
 *
 * @author Andromeda
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
            AC ac1 = new AC();
            ac1.clearResult();
            
            Scanner input = new Scanner(System.in);
            while(input.hasNextDouble()){
            double n1 = input.nextDouble();
            String operation = input.next();
            double n2 = input.nextDouble();
                        
            switch (operation)  {
                case "+":
                Plus P1 = new Plus();
                double n1PlusN2 = P1.aduna(n1, n2);
                Equal additionResult = new Equal();
                additionResult.showResult(n1PlusN2);
                break;
                case "-":
                Minus Dif1 = new Minus();
                double n1MinusN2 = Dif1.decrease(n1, n2);
                Equal differenceResult = new Equal();
                differenceResult.showResult(n1MinusN2);
                break;
                case "/":
                Division Div1 = new Division();
                double n1DivN2 = Div1.divide(n1, n2);
                Equal divisonResult = new Equal();
                divisonResult.showResult(n1DivN2);
                break;
                case "*":
                Multiplication M1 = new Multiplication();
                double n1MultN2 = M1.multiply(n1, n2);
                Equal multiplicationResult = new Equal();
                multiplicationResult.showResult(n1MultN2);
                break;
                default:
                System.out.println("Operations accepted are: \'+' \'-' \'*' \'/'");
            }
        }
    }
}
