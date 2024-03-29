//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
           adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        //System.out.println(adj);
        ArrayList<Integer> topo= new ArrayList<>();
        int[] indegree= new int[N];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            for(int k:adj.get(i))
            indegree[k]++;
        }
        for(int i=0;i<N;i++){
            if(indegree[i]==0)
            q.add(i);
        }
        while(!q.isEmpty()){
            int val = q.poll();
            topo.add(val);
            for(int i:adj.get(val)){
                indegree[i]--;
                if(indegree[i]==0) q.add(i);
            }
        }
        if(topo.size()==N) return true;
        return false;
    }
    
}