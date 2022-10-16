class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int res=-1;
            for(int p:nums){
                if(p>0&(set.contains(-p))) res=Math.max(res,p);
            }
        return res;
    }
}