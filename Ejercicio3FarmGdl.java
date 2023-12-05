import java.util.Arrays;

public class Ejercicio3FarmGdl {
    // Exercise 3
    // Desarrollar en Java o Javascript, una función que reciba al menos un arreglo de
    // números enteros ordenados y un número a buscar, la función deberá realizar una
    // búsqueda binaria aplicando funciones recursivas y retornar la posición del arreglo
    // donde encontró el valor o -1 en caso de no encontrarlo. Nota: El objetivo es
    // desarrollar el algoritmo y la lógica de búsqueda, por lo que no se permite el
    // uso de funciones nativas resuelvan el problema.

    public static void main(String[] args) {
        int[] list = { 1, 3, 5, 7, 8, 9, 10, 12, 15, 17, 21};
        int searchNumber = 11;
        System.out.println(retornar(list, searchNumber,0,list.length-1));
    }

    public static int retornar(int[] list, int searchNumber, int start, int end){
        int middle = (start+end)/2;

        if(searchNumber == list[middle]){
            return middle;
        }else if (searchNumber<list[middle]){
            end = middle-1;
        }else if (searchNumber>list[middle]){
            start = middle+1;
        }
        if (start>end)return -1;

        return retornar(list, searchNumber, start, end);
    }
}
