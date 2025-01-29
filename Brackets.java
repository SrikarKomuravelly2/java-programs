package DataStructures;

import java.util.Stack;

public class Brackets {
	
	public static void main(String[] args) {
		
		
		String input1= "[()]{}{[()()]()}";
		
		String input2="[(])";
		
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		System.out.println(isBalanced(arr1));
		System.out.println(isBalanced(arr2));
		
		
		
	}

	public static boolean isBalanced(char[] ch) {
		
		Stack<Character> st= new Stack<Character>();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			/// If any chanracter is opened use this if condition to push elements into stack
			if(ch[i]=='(' ||ch[i]=='{' || ch[i]=='[')
			{
				st.push(ch[i]);
			}
			
			else {		
				
				if(st.isEmpty())
				{
					return false;
				}
				
				char pop=st.pop();
				
				if(ch[i]!=')' && pop=='(')
				{
					return false;
				}
				
				if(ch[i]!='}' && pop=='{')
				{
					return false;
				}
				
				if(ch[i]!=']' && pop=='[')
				{
					return false;
				}
			}	
		}
		return st.isEmpty();
		
	}
}
