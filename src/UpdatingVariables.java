import com.sun.org.apache.xpath.internal.objects.XString;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono por $200

        salary = salary + 200;
        System.out.println(salary);

        //Pension de $50

        salary = salary - 50;
        System.out.println(salary);

        //Trabajo 2 horas $30 c/u
        //Cupon comida $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Julián Alvarado";
        employeeName = employeeName + " Gantiva";
        System.out.println(employeeName);
        employeeName = "David " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);



    }
}
