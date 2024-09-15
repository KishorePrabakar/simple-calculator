import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1 = in.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = in.nextInt();
		System.out.println("Enter your choice of operation[+, -, *, /]: ");
		char ch = in.next().charAt(0);
		int result;

		switch(ch){
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 != 0){
				result = num1 / num2;
				} else{
					System.out.println("Error! Check Input");
					return;}
				break;
			default:
				System.out.println("Error! Operation is not correct.");
				return;}
		System.out.println("The result is " + result);
	}
}
