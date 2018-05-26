package Codeabbey;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Программа проверяющая корректную
 * последовательность скобок
 */
public class CheckingParentheses {
    public static void main(String[] args) {
        String str = "(g){/(x)}{v}<t>(/)[[[g]w]{<{w}z>x[x]}<^><t>[c]]";
        System.out.println(isValidExpression(str));
    }



    public static boolean CheckParentheses(String string) {
        if (string.isEmpty())
            return true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current == '{' || current == '(' ||
                    current == '[' || current == '<') {
                stack.push(current);
            }


            if (current == '}' || current == ')' ||
                    current == ']' || current == '>') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '('
                        || current == ']' && last == '[' || current == '>' && last == '<')
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }

    /**
     * Реализация через коллекцию Map
     */
    public static boolean isValidExpression(String expression) {
        Map<Character, Character> openClosePair = new HashMap<>();
        openClosePair.put(')', '(');
        openClosePair.put('}', '{');
        openClosePair.put(']', '[');
        openClosePair.put('>', '<');

        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (openClosePair.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != openClosePair.get(ch)) {
                    return false;
                }
            } else if (openClosePair.values().contains(ch)) {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
