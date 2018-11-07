package com.jeetprksh.ds.balancedparentheses;

import java.util.Stack;

public class BalancedParenthesesStack implements BalancedParentheses {

    private final String input;
    private final Stack<Character> stack = new Stack();

    public BalancedParenthesesStack(String input) {
        this.input = input;
    }

    @Override
    public boolean isBalanced() {
        for (Character ch : input.toCharArray()) {
            Parentheses para = Parentheses.findMatch(ch).get();
            if (para.isOpen()) {
                stack.push(para.getParentheses());
            } else {
                Parentheses popped = Parentheses.findMatch(stack.pop()).get();
                if (!Parentheses.isOpenClosePair(popped, para)) return false;
            }
        }

        return stack.isEmpty();
    }
}
