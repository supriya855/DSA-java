class Solution {
    public int findKthLargest(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length-k];
       
//    boolean thereIsBubbling;
//         int temp;
//         do {
//             thereIsBubbling = false;
//             for (int i = 0; i < array.length - 1; i++)
//             {
//                 if (array[i] < array[i + 1])
//                 {
//                     thereIsBubbling = true;
//                     temp = array[i];
//                     array[i] = array[i + 1];
//                     array[i + 1] = temp;
//                 }
//             }
//         }while (thereIsBubbling);
       
//  System.out.println(Arrays.toString(array));
//         return array[k-1];
    }
}