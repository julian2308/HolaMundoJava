import org.w3c.dom.ls.LSOutput;

public class Casting {

    public static void main(String[] args) {

        //En un año ubicar 30 perritos
        //Cuámtos perritos ubiqué al mes

        double perritosRescatados = 30.0/12.0;
        System.out.println(perritosRescatados);

        //Estimacion
        int stimadoDePerritosSalvados  = (int) perritosRescatados;
        System.out.println(stimadoDePerritosSalvados);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);



    }
}


