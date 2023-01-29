class Solution {
    // for ex=n=4 and k=17
    public String getPermutation(int n, int k) {
        List<Integer> num= new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;// finding factorial
            num.add(i);//[1,2,3]
        }
        num.add(n);//[1,2,3,4]
        k=k-1;//17-1=16
        String ans="";
        while(true){
        ans+=num.get(k/fact);// 16/6=2  i.e is 3 adding into ans 
        num.remove(k/fact);// remove that particular element to find next one
        if(num.size()==0){// num.size 0 we find of kth permutation
            break;
        }
        k=k%fact;
        fact=fact/num.size();// here to reduce we fact we are using
            /* 4!=24
            3!=6
            2!=2
            1!=1
            */
        }
        return ans;
        
    }
    
}
/*Intially take the array [1,2,3,4] (k=16,n=4)
find the factorial i.e is 6
k=k-1 i.e 16
case -1: for k=16
for [1,2,3,4]
we have 
1+(2,3,4)-> 3!=6
2+(1,3,4)-> 3!=6
3+(1,2,4)-> 3!=6
4+(1,2,3)-> 3!=6
total :24=n!
take out of 16/6 =2 and taking that element and add into a ans i.e is 3
k=k%fact i.e is 4
case-2 :[1,2,4] for k=4
1+(2,4)=2!
2+(1,4)=2!
4+(1,2)=2!
total:6
k=k/2->4/2=2 so we are removing second element k=k%2= 4%2=0
case-3: [1,2] 
[1]+[2]
k=k/2=0/2
[2]
final ans = [3,4,1,2]
*/


