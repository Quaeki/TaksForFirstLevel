package org.example;

import java.util.*;

public class Main {

    // ===== Тесты =====
    public static void main(String[] args) {
        System.out.println("== Задание 1: Валидные скобки ==");
        Task1_ValidParentheses t1 = new Task1_ValidParentheses();
        System.out.println("() -> " + t1.isValid("()"));               // true
        System.out.println("()[]{} -> " + t1.isValid("()[]{}"));       // true
        System.out.println("(] -> " + t1.isValid("(]"));               // false
        System.out.println("([)] -> " + t1.isValid("([)]"));           // false
        System.out.println("{[]} -> " + t1.isValid("{[]}"));           // true
        System.out.println("\"\" -> " + t1.isValid(""));               // true

        System.out.println("\n== Задание 2: Слияние двух отсортированных массивов (in-place) ==");
        Task2_MergeSortedArray t2 = new Task2_MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        t2.merge(nums1, nums2, 3, 3);
        System.out.println("merge([1,2,3,0,0,0],3,[2,5,6],3) -> " + Arrays.toString(nums1)); // [1,2,2,3,5,6]

        int[] nums1b = {0};
        int[] nums2b = {1};
        t2.merge(nums1b, nums2b, 0, 1);
        System.out.println("merge([0],0,[1],1) -> " + Arrays.toString(nums1b)); // [1]

        System.out.println("\n== Задание 3: Максимальная прибыль от одной сделки ==");
        Task3_BestTimeToBuySellStock t3 = new Task3_BestTimeToBuySellStock();
        System.out.println("[7,1,5,3,6,4] -> " + t3.maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println("[7,6,4,3,1] -> " + t3.maxProfit(new int[]{7,6,4,3,1}));     // 0

        System.out.println("\n== Задание 4: Анаграмма ==");
        Task4_ValidAnagram t4 = new Task4_ValidAnagram();
        System.out.println("anagram vs nagaram -> " + t4.isAnagram("anagram", "nagaram")); // true
        System.out.println("rat vs car -> " + t4.isAnagram("rat", "car"));                 // false

        System.out.println("\n== Задание 5: RecentCounter ==");
        RecentCounter rc = new RecentCounter();
        System.out.println("ping(1) -> " + rc.ping(1));       // 1 (окно [-2999,1])
        System.out.println("ping(100) -> " + rc.ping(100));   // 2 (окно [-2900,100])
        System.out.println("ping(3001) -> " + rc.ping(3001)); // 3 (окно [1,3001])
        System.out.println("ping(3002) -> " + rc.ping(3002)); // 3 (окно [2,3002])
    }
}
