package GlobantPractice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class CodeSnippets {

	public static void main(String[] args) {
		
	CodeSnippets cp = new CodeSnippets();
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	if(cp.BalancedString(s)) {
		System.out.println("String is balanced");
	}
	else
		System.out.println("String is not balanced");
		
	}
	
	public boolean BalancedString(String s) {
		
		boolean flag= false;
		HashMap<Character, Character> map = new HashMap<>();
		map.put('[', ']');
		map.put('(', ')');
		map.put('{', '}');
		Stack<Character> stack= new Stack<>();
		
		for(int i=0; i<s.length();i++) {
			char current= s.charAt(i);
			if(map.containsKey(current))
				stack.push(current);
			else if(map.values().contains(current)) {
				if(!stack.empty() && map.get(stack.peek())==current)
				{
					stack.pop();
				}
				else
					return false;
						
			}
			
		}
		
		return stack.empty();
		
	}

}
