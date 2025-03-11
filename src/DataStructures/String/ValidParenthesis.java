package DataStructures.String;

/* Valid Parentheses :
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
string is valid.*/

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("([())"));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char top = s.charAt(i);
            if(top=='('||top=='{'||top=='['){
                stack.push(top);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                if(pop==')' && top!='(' || pop=='}' && top!='{' || pop==']' && top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
