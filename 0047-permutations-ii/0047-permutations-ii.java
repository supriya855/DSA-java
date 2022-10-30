class Solution {
    public void recursion(int[] nums, List<List<Integer>> ans,List<Integer> ds,boolean[] frq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i-1]==nums[i]&&!frq[i-1]) continue;
            if(!frq[i]){
                frq[i]=true;
                ds.add(nums[i]);
                recursion(nums,ans,ds,frq);
              ds.remove(ds.size()-1);
                frq[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> ans= new ArrayList<>();

       List<Integer> ds= new ArrayList<Integer>();
        boolean[] frq= new boolean[nums.length];
        Arrays.sort(nums);
        recursion(nums,ans,ds,frq);
        return ans;
      
    }
}