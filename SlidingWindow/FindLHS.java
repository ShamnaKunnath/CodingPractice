class FindLHS {
    public int findLHS1(int[] nums) {
        int n = nums.length, maxL = 0;
        if(n <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int left = 0, right = 1;
        while(right < n){
            int diff = nums[right] - nums[left];
            if(diff == 1){
                maxL = Math.max(maxL, right-left+1);
            }
            if(diff <= 1){
                right++;
            }
            else{
                left++;
            }
        }
        return maxL;
    }
    //Time Complexity : O(nlogn), for sorting 
    //Space Complexity : In worst case O(n), but in average case O(logn) space is required by sorting.

    public int findLHS2(int[] nums) {
        int n = nums.length, maxL = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq+1);
        }
        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                maxL = Math.max(maxL, map.get(key)+map.get(key+1));
            }
        }
        return maxL;
    }

    //Time Complexity : O(n), One loop is required to fill map and one for traversing the map.
    //Space Complexity : O(n), In worst case map size grows upto size n.

}