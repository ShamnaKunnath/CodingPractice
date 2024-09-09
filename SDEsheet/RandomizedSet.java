class RandomizedSet {
	List<Integer> list;
	Map<Integer, Integer> map;

	public RandomizedSet() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}

	public boolean insert(int val) {
		if(map.containsKey(val)) {
			return false;
		}
		else{
			list.add(val);
			map.put(val, list.size()-1);
			return true;
		}
	}

	public boolean remove(int val) {
		if(map.containsKey(val)){
			int index = map.get(val);
			list.set(index, list.get(list.size()-1));
			map.put(list.get(index), index);

			list.remove(list.size()-1);
			map.remove(val);
			return true;
		}
		else{
			return false;
		}
	}

	public int getRandom() {
		Random r = new Random();
		return list.get(r.nextInt(list.size()));
	}
}