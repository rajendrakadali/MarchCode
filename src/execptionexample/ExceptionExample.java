package execptionexample;

import java.util.Scanner;

public class ExceptionExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dividend, divisor, quotient;
    
    try {
      System.out.print("Enter dividend: ");
      dividend = scanner.nextInt();
      
      System.out.print("Enter divisor: ");
      divisor = scanner.nextInt();
      
      quotient = dividend / divisor;
      System.out.println("Quotient = " + quotient);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unknown error occurred.");
    } finally {
      scanner.close();
    }
  }
}