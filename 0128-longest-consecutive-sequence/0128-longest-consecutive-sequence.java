class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int count=1,max=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        ArrayList<Integer> list= new ArrayList<>(set);
         Collections.sort(list);
        if(list.size()==1) return list.size();
        
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)-1){
                count++;
            }
            else
                count=1;
            max=Math.max(max,count);
        }
        return max;
    }
}