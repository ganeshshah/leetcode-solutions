class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        
        int n = nums.length;
        for(int i=0;i<n-3;i++)
            for(int j=i+1;j<n-2;j++)
                 {
                    int k =j+1;
                    int l = n-1;
                    while(k<l)
                    { 
                        long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                        if((long)target-sum == 0)
                            result.add(List.of(nums[i],nums[j],nums[k++],nums[l]));
                        else if(target-sum > 0)
                            k++;
                        else l--;
                    }
                
                }
        
        List<List<Integer>> li = new ArrayList<>(result);
        return li;
                
            }
    }
