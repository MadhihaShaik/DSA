package Arrays;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int j=0;j<5;j++){
            System.out.print(list.get(j));
        }
    }
}
