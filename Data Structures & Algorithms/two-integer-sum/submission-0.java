class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int desiredValue = target - nums[i];
            if(map.containsKey(desiredValue)){
                return new int[] {map.get(desiredValue), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
