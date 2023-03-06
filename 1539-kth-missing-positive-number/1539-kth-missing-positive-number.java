class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);// set to remove duplicates in an input array
        }
        int count=1;// is an iterator to find the missing elements
        while(k!=0){
            if(set.contains(count)){
                count++;
            }
            else{
                k--;
                count++;
            }
        }
        return count-1;
    } 
}