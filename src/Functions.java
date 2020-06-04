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

        System.out.println("El área de su esfera es: " + sphereArea(4));

        System.out.println("El radio del círculo es:" + circleArea(5));







    }
    /**
     * Descripción: Función que dando el radio de un círculo nos da su área
     *
     * @param r Es el radio del círculo del cúal queremos obtener su área
     * @return circleArea devuelve el área del círculo
     * {@code ¡Batman was here!}
     * @exception double-5 La única excepción es el número 5
     * */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    /**
     * Descripción: Función que dando el radio de una esfera, nos calcula su área
     *
     * @param r Es el radio de la esfera la cual queremos obtener su área
     * @return sphereArea devuelve el área de la esfera
     * */
    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    /**
     * Descripción: Función que dando el radio de una esfera, nos da el volumen de esta
     *
     * @param r Es el radio de la esfera la cual queremos obtener su volumen
     * @return spehreVolumen Devuelve el volumen de la esfera
     * */
    public static double sphereVolumen (double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
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
