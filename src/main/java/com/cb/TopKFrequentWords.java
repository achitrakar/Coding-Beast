/**
 * Copyright 2022, Coding Beast
 */
package com.cb;

import java.util.*;

/**
 * Leetcode: #692
 * Category: Medium
 * URL: https://leetcode.com/problems/top-k-frequent-words/
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        var frequency = new HashMap<String, Integer>();

        // Counting
        for (String word: words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        // Use Priority Queue
        PriorityQueue<String> pq = new PriorityQueue<>((word1, word2) -> {
            // Sorting
            int frequency1 = frequency.get(word1);
            int frequency2 = frequency.get(word2);

            if (frequency1 == frequency2) return word2.compareTo(word1);
            return frequency1 - frequency2;
        });

        frequency.forEach((key, value) -> {
            pq.add(key);
            if (pq.size() > k) pq.poll();
        });

        var result = new ArrayList<String>();

        while(!pq.isEmpty()) result.add(pq.poll());

        Collections.reverse(result);
        return result;
    }
}
