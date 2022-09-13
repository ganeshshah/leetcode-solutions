public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
        long sum = 0;
        long dup = 0;
        long n = A.length;
        Arrays.sort(A);
        for(int i=0;i<n;i++)
            sum +=A[i];
        for(int i=1;i<n;i++)
        {
            if(A[i-1]-A[i] == 0)
            {
                dup = A[i];
                break;
            }
        }
        
        sum = sum - dup;
        long miss = n*(n+1)/2 - sum;
        int res[] = new int[2];
        res[0]=(int)dup;
        res[1]=(int)miss;
        return res;
    }
}
