public class Ejercicio2FarmaGdl {
    public static void main(String[] args) {
        System.out.println(regresaCambio(22, 100));
    }
    //50, 20, 5, 1
    public static String regresaCambio(int precio, int pago){
        int total = pago - precio;
        int [] cambio = { 50, 20, 5, 1};
        String receipt = "";

        for (int i=0; i<cambio.length;i++){
            int temp = total/cambio[i];
            total = total%cambio[i];
            receipt += temp + " de " + cambio[i] + " $" + "\n";
           cambio[i]= temp;
        }

        receipt += "Cambio total: " + (pago-precio);

        return receipt;
    }
}