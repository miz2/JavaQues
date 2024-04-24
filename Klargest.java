import java.util.Arrays;

public class Klargest {
    public static int[] klargest(int[] a, int k, int n) {
        // Write your code here
        Arrays.sort(a);
        int[] answer = new int[k]; // Corrected initialization of array
        // now fill the elements in kth order
        for (int i = n-k, j = 0; i < n; i++, j++) {
            answer[j] = a[i]; // Corrected array name
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 3};
        int k = 3;
        int n = array.length;
        int[] result = klargest(array, k, n);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
