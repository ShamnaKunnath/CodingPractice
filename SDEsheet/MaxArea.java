class MaxArea {
	public int maxArea(int[] height) {
		int maxCapacity = 0;
        int i = 0, j = height.length - 1;

        while(i < j){
            int cap;
            if(height[i] < height[j]){
                cap = height[i]*(j-i);
                i++;
            }
            else {
                cap = height[j]*(j-i);
                j--;
            }
            if(cap > maxCapacity){
                maxCapacity = cap;
            }
        } 
        return maxCapacity;
	}
}