class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes= new HashSet<>();
        Set<Integer> set= new HashSet<>();
        for(int i=1;i<=1000;i++){
            if(prime(i)){
                primes.add(i);
            }
           
        }
        for(int i:nums){
            for(int j:primes){
                if(i%j==0){
                    set.add(j);
                }
            }
        }
        
        
        return set.size();
        
    }
    public boolean prime(int n){
        if(n==1||n==0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}