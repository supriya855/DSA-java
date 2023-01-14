//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        ArrayList<Integer> res= new ArrayList<>();
        sum(arr,0,0,ans,res);
        return res;
    }
    
    public void sum(ArrayList<Integer> arr,int idx,int sum,ArrayList<Integer> ans,ArrayList<Integer> res){
      if(idx==arr.size()){
          
          for(int i=0;i<ans.size();i++){
              sum+=ans.get(i);
          }
          res.add(sum);
         
          return;
      }
      ans.add(arr.get(idx));
      sum(arr,idx+1,sum,ans,res);
      ans.remove(ans.size()-1);
       sum(arr,idx+1,sum,ans,res);
      
      
      
    }
}