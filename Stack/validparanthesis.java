package Stack;
import java.util.*;
public class validparanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; // No matching opening bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }
        return stack.isEmpty(); // All brackets matched
    }

    public static void main(String[] args) {
        String s1 = "({[]})";
        String s2 = "([)]";

        System.out.println(s1 + " -> " + isValid(s1)); // true
        System.out.println(s2 + " ->" + isValid(s2)); // false
    }

}
