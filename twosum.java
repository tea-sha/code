/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

**/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target -nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
                map.put(nums[i],i);
        }
        return null;
        
    }
}


/**
Time complexity: O(n). We traverse the list containing nn elements only once. Each lookup in the table costs only O(1) time.

Space complexity: O(n)The extra space required depends on the number of items stored in the hash table

**/
