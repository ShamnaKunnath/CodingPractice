public class Main(String[] args) {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans =  new ArrayList<>();
		helper(0, ans, new ArrayList<>(), candidates, target);
		return ans;
	}

	private void helper(int ind, List<List<Integer>> ans, List<Integer> ds, int[] arr, int target) {
		if(ind == arr.length){
			if(target == 0){
				ans.add(new ArrayList<>(ds));
			}
			
			return ;
		}
		if(arr[ind] <= target){
			ds.add(arr[ind]);
			helper(ind, ans, ds, arr, target-arr[ind]);
			ds.remove(ds.size()-1);
		}
		helper(ind+1, ans, ds, arr, target);

	}

	public static void main(String[] args) {
		int[] arr = {2,3,5,7};
		int target = 7;
		List<List<Integer>> res = combinationSum(arr, target);
		System.out.println("Answer : ");
		for(int i = 0; i < res.length; i++){
			for(int j = 0; j < res[i].length; j++){
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}