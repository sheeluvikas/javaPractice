package coding.stack;

import java.util.Stack;

public class RemoveAdjacentDups {

    public static void main(String[] args) {
        String s = "abbaca";

        System.out.println(removeDups(s));
    }

    public static String removeDups(String s){

        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else {
                char value = stack.peek();
                if(value == arr[i]){
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }

        String outString = "";
        for(int i = 0; i < stack.size(); i++){
            outString = outString + stack.get(i);
        }
        return outString;
    }
}
