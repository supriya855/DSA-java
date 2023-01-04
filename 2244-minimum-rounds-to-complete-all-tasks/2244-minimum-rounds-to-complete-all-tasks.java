class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(map.containsKey(tasks[i]))
            map.put(tasks[i],map.get(tasks[i])+1);
            else{
                map.put(tasks[i],1);
            }
        }
        int ans=0;
       for(int k: map.values()){
           if(k==1) return -1;
           ans+=(k+2)/3;
       }
        return ans;
        
    }
}