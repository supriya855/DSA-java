//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int n=grid.length,countFresh;
        int m=grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        // which store as a pair ex: (0,1,0)
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else
                visited[i][j]=0;
            }
        }
        // The above whole for loop check for intiallly what are indexs pf rotten oranges 
        // adding into a queue similarly we adjusting our vis arry
        int tm=0;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        while(!q.isEmpty()){
            // These are (i-1,j), [i,j-1], [i+1,j], [i,j+1] 
            int neighNodeRow=0;
            int neighNodeCol=0;
            int r=q.peek().row;// this while in queue what is first inserted row value
            int c=q.peek().col;// same 
            int t=q.peek().tm;//same
            tm=Math.max(tm,t);// finding minmum unit of time required to make all rotten oranges
            q.remove();
            // all 4 neighbours
            for(int i=0;i<4;i++){
            neighNodeRow = r+delrow[i];
            //checking for its neighbour node row
             neighNodeCol=c+delcol[i];
             // neighbour node col
            // if the particular neighnode is 1 in grid and its not visited array if its zero and satisfiy all its boundary condtions
            // i.e it should be inside the matrix
            if(neighNodeRow>=0&&neighNodeRow<grid.length&&neighNodeCol>=0&&neighNodeCol<grid[0].length&&visited[neighNodeRow][neighNodeCol]==0&&grid[neighNodeRow][neighNodeCol]==1){
                q.add(new Pair(neighNodeRow,neighNodeCol,t+1));
                visited[neighNodeRow][neighNodeCol]=2;
            }
            
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=2&&grid[i][j]==1) return -1;
        }
    }
    return tm;
}
}
class Pair{
    int row;
    int col;
    int tm;
    Pair(int r,int c,int t){
        this.row=r;
        this.col=c;
        this.tm=t;
    }
}