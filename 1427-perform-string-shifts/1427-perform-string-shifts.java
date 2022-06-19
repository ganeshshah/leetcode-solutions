import java.util.*;
import java.io.*;

class Solution {
    
    public String stringShift(String s, int[][] shift) {
        
        int shifts = 0;
        int n = s.length();
        
        for (var pair : shift)
        	shifts += pair[0] == 0 ? pair[1] : -pair[1];
        shifts %= n;
        
       if (shifts == 0)
		return s;
		
	   return shifts < 0 ? s.substring(n + shifts) + s.substring(0, n + shifts) : 
		   s.substring(shifts) + s.substring(0, shifts);
        
        
//     var shifts = 0;
// 	for (var pair : shift)
// 		shifts += pair[0] == 0 ? pair[1] : -pair[1];
// 	var n = s.length();
// 	shifts %= n;

// 	if (shifts == 0)
// 		return s;
		
// 	return shifts < 0 ?
// 		   s.substring(n + shifts) + s.substring(0, n + shifts) : 
// 		   s.substring(shifts) + s.substring(0, shifts);
       
    }
}