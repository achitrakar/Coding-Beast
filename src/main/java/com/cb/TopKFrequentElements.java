package com.cb;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        var frequency = new HashMap<Integer, Integer>();

        for(Integer num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(frequency::get));

        frequency.forEach((key, value) -> {
            pq.add(key);
            if (pq.size() > k) pq.poll();
        });

        int result[] = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }

        return result;
    }
}
