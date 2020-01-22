//P15.7 converts an expression into reverse Polish notation

import java.util.Scanner;
import java.util.Stack;

public class PolishReverse{
	static String outputQueue="";
	   public static void main(String[] args)
	   {  
	      Scanner in = new Scanner(System.in);
	      System.out.print("Enter an expression: ");
	      String expression = in.nextLine().replace(" ", "");

	      Stack<Character> opstack = new Stack<>();
	      
	      int pos = 0;
	      while (pos < expression.length())
	      {  
	         char ch = expression.charAt(pos);
	         pos++;
	         if (Character.isDigit(ch))
	         {
	            int start = pos - 1;
	            while (pos < expression.length()  //checking if it's more than a single digit number
	               && Character.isDigit(expression.charAt(pos))) { pos++; }
	            String num = expression.substring(start, pos);

	            outputQueue += num;
	         }
	         
	         else if (isOperator(ch))
	         {  
	            while(opstack.size() > 0 && 
	            		precedence(opstack.peek()) >= precedence(ch))
	            {

	            	outputQueue += opstack.pop();
	            }
	            opstack.push(ch);
	      }
	   
	         else if (ch == '(') { 
	        	 opstack.push(ch); 
	        	 }
	         else if (ch == ')')
	         {  
	            while(opstack.peek() != '(') {
	            	outputQueue += opstack.pop();
	            }
	            opstack.pop();
	         }

	         else { error ("Number, operator, or parenthesis expected."); }
	      }
	      while (opstack.size() > 0)
	      {  
	         char oldOp = opstack.pop();
	         if (oldOp == '(') { error("No matching )"); }
	         
	         outputQueue += oldOp;
	      }
	    	  System.out.println(outputQueue);
	      
	   }

	   public static boolean isOperator(char ch)
	   {  
	      return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	   }

	   public static void error(String message)
	   {  
	      System.out.println("ERROR: " + message + ".");
	      System.exit(1);
	   }

	   public static int precedence(char ch)
	   {  
	      if (ch == '+' || ch == '-') { return 1; }
	      else if (ch == '*' || ch == '/') { return 2; }
	      else { return 0; }
	   }
}


