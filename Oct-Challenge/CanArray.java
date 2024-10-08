class Main {
	public boolean canArray(int[] arr, int k) {
		int[] freq = new int[k];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i]%k + k)%k;
            freq[arr[i]]++;
        }
        if(freq[0]%2 == 1) return false;
        
        for(int i = 1; i <= k/2; i++){
            if(freq[i] != freq[k-i]) return false;
            if(i == k-i && freq[i]%2 == 1) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		int arr = {1,2,3,4,5,10,6,7,8,9};
		System.out.println(canArray(arr, 10));
	}
}