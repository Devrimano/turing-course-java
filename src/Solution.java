import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] index = new int[2];
        int target = 7;
        boolean found= false;
        for (int i = 0; i < arr.length; i++) {
              for (int j =1 ; j< arr.length; j++){
                  if(arr[i] + arr[j] == target){
                      index[0] += i;
                      index[1] += j;
                      found = true;
                      break;
                  }
                  if (found) break;
              }

        }
        System.out.println(Arrays.toString(index));
    }
}