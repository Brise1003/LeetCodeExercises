public class Ejercicio2FarmaGdl {
    public static void main(String[] args) {
        System.out.println(regresaCambio(22, 100));
    }
    //50, 20, 5, 1
    public static String regresaCambio(int precio, int pago){
        int total = pago - precio;
        int [] cambio = new int[4];

        if(total>=50) {
            cambio[0] = total / 50;
            total = total - cambio[0] * 50;
        }

        if(total>=20){
            cambio[1]= total/20;
            total -= cambio[1]*20;
        }

        if(total>=5) {
            cambio[2] = total / 5;
            total -= cambio[2] * 5;
        }
        cambio[3]= total;


        return cambio[0]+" de 50$, "+cambio[1]+" de 20$, "+cambio[2]+" de 5$, "+cambio[3]+" de 1$ "
                + (pago-precio);

    }

    //Exercise 3
    //Desarrollar en Java o Javascript, una función que reciba al menos un arreglo de números enteros ordenados y un número a buscar, la función deberá realizar una búsqueda binaria aplicando funciones recursivas y retornar la posición del arreglo donde encontró el valor o -1 en caso de no encontrarlo. Nota: El objetivo es desarrollar el algoritmo y la lógica de búsqueda, por lo que no se permite el uso de funciones nativas resuelvan el problema.

}