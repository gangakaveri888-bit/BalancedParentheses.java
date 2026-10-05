import java.util.Stack;
class BalancedParentheses {
    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
           if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
               if (stack.isEmpty()) {
                    return false;
                }
              stack.pop();
            }
        }
        return stack.isEmpty();
    }
   public static void main(String[] args) {
        String expression = "(A+B)*(C-D)";
        if (isBalanced(expression)) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }
    }
}
OUTPUT:
Parentheses are balanced
