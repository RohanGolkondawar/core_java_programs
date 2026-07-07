import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the "+a+" Elements");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i< arr.length-1;i++){
            for (int j=0;j<a-i-1;j++)
           if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }





    }
}
