class TwoSum {

    private ArrayList<Integer> nums;
    
    
    public TwoSum() {
        nums = new ArrayList<Integer>();
    }
    
    public void add(int number) {
         nums.add(number);
    }
    
    public boolean find(int value) {
      
      Collections.sort(nums);
      
      int low = 0, high = nums.size() - 1;
      while (low < high) {
      int twosum = nums.get(low) + nums.get(high);
      if (twosum < value)
        low += 1;
      else if (twosum > value)
        high -= 1;
      else
        return true;
    }
    return false;    
    }
    
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */