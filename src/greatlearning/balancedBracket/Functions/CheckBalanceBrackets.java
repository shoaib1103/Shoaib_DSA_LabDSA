package greatlearning.balancedBracket.Functions;

import java.util.*;

public class CheckBalanceBrackets {
	
	public boolean isBracketBalanced(String expr) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		Set<Character> acceptedChar = new HashSet<Character>();
	
		acceptedChar.add('(');
		acceptedChar.add('{');
		acceptedChar.add('[');
		acceptedChar.add(')');
		acceptedChar.add('}');
		acceptedChar.add(']');
		
		for(int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);
			
			if (!acceptedChar.contains(x)) {
				System.out.println("Invalid input String");
				return false;
			}
			if  (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char check;
			switch (x) {
			case ')' :
				check = stack.pop();
				if (check == '{' || check == '[') {
					return false;
					
				}
				break;
			case ']' :
			    check = stack.pop();
			    if (check == '(' || check == '{') {
					return false;
			}
			    break;
		}

		
	   }
		return (stack.isEmpty());

    } 
}
