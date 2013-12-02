import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */

	public static int add(int x, int y){
		int result = x + y;
		return result;
	}
	public static int multiply(int x, int y){
		int result = x * y;
		return result;
	}
	public static int subtract(int x, int y){
		int result = x - y;
		return result;
	}

	public static float divide(int x, int y){
		float floatX = (float)x;
		float floatY = (float)y;
		float result = floatX / floatY;
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		
		while(run){

			System.out.println("Enter your function: ");
			Scanner userInput = new Scanner(System.in);
			String numberStr1 = userInput.findInLine("(\\d+)");
			String expression = userInput.findInLine("[+-/(\\*)]");
			String quitCheck = userInput.findInLine("quit");
			String numberStr2 = userInput.findInLine("(\\d+)");
			if (quitCheck == null){
					if(numberStr1 == null || numberStr2 == null || expression == null) {
					System.out.println("That command is not recognised");
				}
					else if (numberStr1 != null || numberStr2 != null || expression != null) {
						int number1 = Integer.valueOf(numberStr1);
						int number2 = Integer.valueOf(numberStr2);
						switch (expression) {
						case "+": int result1;
								result1 = add(number1, number2);
								System.out.println("The result is: " + result1 );
								break;
						case "-": int result2; 
								result2 = subtract(number1, number2);
								System.out.println("The result is: " + result2 );
								break;
						case "/": float result3;
								result3 = divide(number1, number2);
								System.out.println("The result is: " + result3);
								break;
						case "*": int result4;
								result4 = multiply(number1, number2);
								System.out.println("The result is: " + result4);
								break;
						
				
						}
					}
			}
			if(quitCheck != null){
				run = false;
				userInput.close();
			}
		}
	}

}
