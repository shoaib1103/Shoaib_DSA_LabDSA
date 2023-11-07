package greatlearning.balancedBracket.Functions;

import java.util.Scanner;

import greatlearning.balancedBracket.Functions.CheckBalanceBrackets;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		sc.close();
		
		CheckBalanceBrackets bracket = new CheckBalanceBrackets();
		bracket.isBracketBalanced(expr);
		
		if (bracket.isBracketBalanced(expr)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		

		
	}

}
