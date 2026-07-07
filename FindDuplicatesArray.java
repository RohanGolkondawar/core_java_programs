

public class FindDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,4,3,8,5,2,7,6,0,7};
        int i,j;
        System.out.print("Duplicates are :");
        for(i=0;i<arr.length;i++){
            for(j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }

        }
    }
}
