package Stack;

import java.util.Scanner;
import java.util.Stack;

public class removeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        //sc.nextLine(); // consume newline

        while (T-- > 0) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    // Check for "10" or "00"
                    if ((top == '1' && ch == '0') || (top == '0' && ch == '0')) {
                        stack.pop(); // delete both
                        continue;
                    }
                }
                stack.push(ch); // push current character
            }

            // Result length = characters left in the stack
            System.out.println(stack.size());
        }
    }
}
