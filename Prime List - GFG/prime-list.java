//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution
{
    boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    Node primeList(Node head){
       Node temp=head;
       while(temp!=null){
       int n=temp.val;
       if(n==1){
           temp.val=2;
           temp=temp.next;
           continue;
       }
       int prev=n;
       int ahead=n;
       while(!isPrime(prev)){
           prev--;
       }
       while(!isPrime(ahead)){
           ahead++;
       }
       int dist1=ahead-n;
       int dist2=n-prev;
       if(dist1<dist2){
           temp.val=ahead;
       }
       else if(dist1>dist2)
           temp.val=prev;
       else
          temp.val=prev;
       temp=temp.next;
       }
       return head;
    }
}