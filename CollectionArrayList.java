import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(3);
        l1.add(2);
        l1.add(1);
       boolean valueFound =  l1.contains(2);
        System.out.println(valueFound);


        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }

    }
}
