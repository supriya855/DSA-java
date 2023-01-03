class Solution {
    List<Integer> row,prev=null;
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
           row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i) row.add(1);
                else
                    row.add(prev.get(j-1)+prev.get(j));
            }
            prev=row;
            list.add(row);
            
        }
        return list.get(rowIndex);
      
    }
}