package Aug2024;

import java.util.Stack;

public class ValidateParenthese {
	
	
	public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
        	 // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
             // If the character is a closing bracket, check for a match with the top of the stack
            } else if (c == ')' || c == ']' || c == '}') {
            	 // If the stack is empty or the top doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                	(c == ']' && top != '[') || 
                	(c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // If the stack is empty at the end, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString = "()[]{}";
        System.out.println("Is the string \"" + testString + "\" balanced? " + isBalanced(testString));
    }

}
