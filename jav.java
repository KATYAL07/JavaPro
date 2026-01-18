import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        

        int product = 1;
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
            factorial[i] = product;
            numbers.add(i);
        }
        

        k--; 
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {

            int blockSize = factorial[n - i];
            
            int index = k / blockSize;
            
            sb.append(numbers.get(index));
            

            numbers.remove(index);
            
            k = k % blockSize;
        }
        
        return sb.toString();
    }
}
