public class ifStatement {
    public static void main(String[] args) {
         boolean isBluetoothEnabled = false;
         int fileSended = 3;

         if(isBluetoothEnabled){
             //Send file

             fileSended++;
             System.out.println("El archivo se envió exitosamente");

         } else {
             fileSended--;
             System.out.println("Por favor enciende tu Bluetooth, para iniciar la transferencia");

         }
        System.out.println(fileSended);


    }
}
