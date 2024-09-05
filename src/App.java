
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        long average = 0;
        int numCount = 1;

        while(flag){
            try {
                int userInput = scanner.nextInt();
                
                sum += userInput;
                average = numCount == 1 ? userInput : Math.round((double) sum / (double) numCount);
                numCount++;

            } catch (InputMismatchException e) {
                flag = false;
                scanner.close();
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
