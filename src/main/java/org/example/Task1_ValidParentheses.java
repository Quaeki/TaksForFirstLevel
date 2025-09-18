package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

class Task1_ValidParentheses {
    public boolean isValid(String s) {
        if ((s.length() & 1) == 1) return false;
        Map<Character, Character> closeToOpen = Map.of(
                ')', '(', ']', '[', '}', '{'
        );
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty() || st.peek() != closeToOpen.get(c)) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}

