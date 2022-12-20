// class Solution {
//     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//         Queue<Integer> q= new LinkedList<>();
//         boolean[] visited= new boolean[rooms.size()];
//         int n=rooms.get(0).size();
//         System.out.println(n);
//         for(int i=0;i<n;i++){
//         q.add(rooms.get(0).get(i));
//         }
//         visited[0]=true;
//         while(!q.isEmpty()){
//             int x=q.poll();
//             if(!visited[x]){
//             int N=rooms.get(x).size();
//             for(int i=0;i<N;i++){
//                if(!visited[rooms.get(x).get(i)]){
//                    q.add(rooms.get(x).get(i));
//                }
//             visited[x]=true;
//             }
//             }
//             q.remove();
            
            
//         }
//         for(int i=0;i<visited.length;i++) {
//             if(!visited[i])
//                 return false;
//         } 
//         return true;
                
//        }
       
// }
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] visited = new int[rooms.size()];
        
        for(int i : rooms.get(0)) {
            queue.add(i);
            visited[i] = 1;
        }
        
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i : rooms.get(temp)) {
                if(visited[i] != 1) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
        
        for (int i = 1; i < visited.length; i++) {
            if(visited[i] == 0) return false;
        }
        
        return true;
    }
}