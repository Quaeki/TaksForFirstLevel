package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {
    private final Deque<Integer> q = new ArrayDeque<>();

    public RecentCounter() {}

    public int ping(int t) {
        q.addLast(t);
        while (!q.isEmpty() && q.peekFirst() < t - 3000) {
            q.removeFirst();
        }
        return q.size();
    }
}
