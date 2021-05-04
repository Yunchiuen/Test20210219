package com.ocp.day19;

import java.util.ArrayList;
import java.util.List;


/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
給定一個整數數組，返回兩個數字的索引，以使它們加起來成為一個特定的目標。
您可以假設每個輸入都只有一個解決方案，並且您可能不會兩次使用相同的元素。
 */
public class Homework_TwoSum {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);
        nums.add(15);
        twoSum(nums, 22);
    }

    public static List<Integer> twoSum(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (target == nums.get(i) + nums.get(j)) {
                    int a = nums.indexOf(nums.get(i));//返回指定元素在此列表中首次出現的索引
                    int b = nums.indexOf(nums.get(j));
                    System.out.printf("[%d %d]", a, b);
                }
            }
        }
        return nums;
    }
}
