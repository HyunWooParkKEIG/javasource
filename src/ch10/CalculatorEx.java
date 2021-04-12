package ch10;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = null;
		
		System.out.print("Input Num1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input Num2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Input operator : ");
		char oper = sc.next().charAt(0);
		
		
		switch (oper) {
		case '+':
			calc = new Add();
			break;
		case '-':
			calc = new Sub();
			break;
		case '*':
			calc = new Mul();
			break;
		case '/':
			calc = new Div();
			break;

		default:
			break;
		}
		
		calc.setValue(num1, num2);
		System.out.println(calc.calculate());
	}

}
