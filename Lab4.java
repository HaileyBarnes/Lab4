import java.util.Collections;
import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {

        int[] array = {37, 12, 17, 59};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        //sort array method
        sort(array);




    }

    public static int[] sort(int[] array){
        //Create new empty array
        int[] array2 = new int[array.length];

        //Copy array to array2
        System.arraycopy( array, 0, array2, 0, array.length );

        System.out.println("Copied & sorted array");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(+ array2[i] + " ");
        }

        Arrays.sort(array2);
        
        return array2;
        //return null;
    }
}