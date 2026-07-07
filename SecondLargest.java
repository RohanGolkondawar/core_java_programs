import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,24,48,15,9,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int secondLargest = arr[arr.length-2];
        System.out.println("Second Largest Element is "+secondLargest);
    }
}
