package packagecom.Shailly.gl.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main (String[] args)
	
		{
			  Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string with brackets: ");
		        String input = scanner.nextLine();

		        if (isBracketBalanced(input)) {
		            System.out.println("The entered String has Balanced Brackets");
		        } else {
		            System.out.println("The entered Strings do not contain Balanced Brackets");
		        }

		        scanner.close();
		}
			
		private static boolean isBracketBalanced(String bracketExpression) {
				// TODO Auto-generated method stub
				  Stack<Character> stack = new Stack<>();
				  for(int i=0;i<bracketExpression.length(); i++) {
					  char ch = bracketExpression.charAt(i);
					  if(ch=='(' || ch== '{' || ch=='[')
						  stack.push(ch);
					  else if (ch==')' || ch== '}' || ch==']') {
					  	if(stack.isEmpty())
					  		return false;
					  	stack.pop();
					  	
					  }
				  }
					  
				
				return stack.isEmpty() ?true:false;
		}
	}