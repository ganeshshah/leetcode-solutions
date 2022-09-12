class Solution {
    
    public void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        
       
      
    int p0 = 0, curr = 0;
    // for all idx > k : nums[idx > k] = 2
    int p2 = nums.length - 1;

    int tmp;
    while (curr <= p2) {
      if (nums[curr] == 0) {
        // swap p0-th and curr-th elements
        // i++ and j++
        swap(nums,curr++,p0++);
      }
      else if (nums[curr] == 2) {
        // swap k-th and curr-th elements
        // p2--
       swap(nums,curr,p2--);
      }
      else curr++;
    }
        
    }
}