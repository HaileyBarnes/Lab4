package Lab_3_Git;
import java.util.Collections;
import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {

        int[] array = {37, 12, 17, 59};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        //sort array method
        sortDecending(array);


    }

    public static int[] sortDecending(int[] array) {
        //Create new empty array
        int[] array2 = new int[array.length];

        //Copy array to array2
        System.arraycopy(array, 0, array2, 0, array.length);

        int temp;
        // cycle through array
        for (int i = 0; i < array2.length; i++) {
            // cycle through array values + 1 (this way we see the first 2 array values as (i,j))
            for (int j = i + 1; j < array2.length; j++) {
                //compare i to j, when j is bigger save the i value as temp and replace i with j. set temp = j.
                if (array2[i] < array2[j])
                {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }

        System.out.println("Copied & sorted in decending order");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(+array2[i] + " ");
        }


        return array2;
        //return null;
    }
}


