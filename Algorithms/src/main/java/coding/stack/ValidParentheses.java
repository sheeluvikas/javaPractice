package coding.stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 */

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String values = "()";
        char[] array = values.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < array.length; i++){
            if(array[i] == '[' || array[i] == '{' || array[i] == '(') {
                stack.push(array[i]);
            }
            else {
                if(stack.empty()){
                    System.out.println(false);
                    break;
                }
                char value = stack.pop();
                if(!((value == '[' && array[i] == ']' )|| (value == '{' && array[i] == '}') || (value == '(' && array[i] == ')'))){
                    System.out.println(false);
                    break;
                }
            }
        }
        if(stack.size() > 0){
            System.out.println(false);
        }
        System.out.println(true);
    }
}
