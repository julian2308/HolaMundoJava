public class Functions {
    public static void main(String[] args) {
        double y = 3;

        //Área de una circulo
        //PI * r2
        circleArea(y);

        //Área de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*PI+r3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDollar(1000, "COP"));








    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen (double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
    /**
     * Descripción: Función qie especificando su moneda convierte una cantidad de dinero a dólares
     *
     * @param quantity cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dólares
     *
     * * */
    public static double converToDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.046;
                break;
            case "COP":
                quantity = quantity * 0.00028;
                break;

        }
        return quantity;
    }
}
