//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends



//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n>m)
         return kthElement(arr2,arr1,m,n,k);
         int low=Math.max(0,k-m) , high=Math.min(k,n);
         while(low<=high){
             int cutLeft=(low+high)>>1;
             int cutRight=k-cutLeft;
             int l1=cutLeft<=0?Integer.MIN_VALUE:arr1[cutLeft-1];
             int l2=cutRight<=0?Integer.MIN_VALUE:arr2[cutRight-1];
             int r1=cutLeft==n?Integer.MAX_VALUE:arr1[cutLeft];
             int r2=cutRight==m?Integer.MAX_VALUE:arr2[cutRight];
             if(l1<=r2&&l2<=r1){
                 return Math.max(l1,l2);
             }
             else if(l1>r2){
                 high=cutLeft-1;
             }
             else{
                 low=cutLeft+1;
             }
         }
         return 1;
    }
    // This is using binary search 
    // Assume 
    /*  2 3 6 7 9
        1 4 8 10
        for this example after sorted whole array
                1 2 3 4 6|7 9 10
                         |( i.e is cut)
        cutLeft             cutRight
        arr1:  2 3 6        7 9
        arr2 : 1 4          8 10
        left part of arr1 i.e l1<=r2
                     arr2: l2<=r1
    */
    
}