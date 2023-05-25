import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i <10; i++) {
            list.set(i, input.nextInt());
        }
        int j = 0;
        int[] arr2 = new int[5];
        for (int i = 0; i < 10; i++) {
            arr2[list.get(i)]=i;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
