public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,3,6};
        int i,j;

        int target = 15;

        for (i=0;i< arr.length;i++){
            for(j=i+1;j<arr.length-1;j++){
                if((arr[i]+arr[j])==target){
                    arr[i] = i;
                    arr[j] = j;
                    System.out.println("Index : "+i+","+j);
                    break;
                }
            }
        }

    }
}
