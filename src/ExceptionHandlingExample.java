
public class ExceptionHandlingExample {


	    public static void main(String[] args) {
	        int[] numbers = { 1, 2, 3, 4, 5 };
	        int divisor = 0;

	        for (int i = 0; i <= numbers.length; i++) {
	            try {
	                // Perform division
	                int result = numbers[i] / divisor;
	                System.out.println("Result: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("Error: " + e.getMessage());
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Error: " + e.getMessage());
	            } finally {
	                System.out.println("Iteration " + i + " completed.");
	            }
	        }
	    }
}
	




