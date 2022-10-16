class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> st= new HashSet<>();
        for(int i:nums){
            st.add(i);
            st.add(reverse(i));
        }
        return st.size();
    }
    public int reverse(int i){
        int rev=0;
        while(i!=0){
            rev=rev*10+i%10;
            i=i/10;
        }
        return rev;
    }
}