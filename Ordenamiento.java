import java.util.Arrays;

public class Ordenamiento {
    public static void main(String[] args) {
        int [] array1 = {5, 3, 2, 8};
        System.out.println(Arrays.toString(ordenamiento(array1)));
    }

    public static int[] ordenamiento(int [] array1){

        for (int i=0;i<array1.length-1;i++){
           for (int j=0;j<array1.length-1;j++){
                   if (array1[j] < array1[j + 1])
                   {
                       int tmp = array1[j+1];
                       array1[j+1] = array1[j];
                       array1[j] = tmp;
                   }
           }
        }

        return array1;
    }
}
