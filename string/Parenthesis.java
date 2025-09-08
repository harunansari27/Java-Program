package string;
import java.util.*;

public class Parenthesis {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Parenthesis vp = new Parenthesis();   // ✅ fixed
        System.out.println(vp.isValid("()"));        // true
        System.out.println(vp.isValid("()[]{}"));    // true
        System.out.println(vp.isValid("(]"));        // false
        System.out.println(vp.isValid("([)]"));      // false
        System.out.println(vp.isValid("{[]}"));      // true
    }
}
