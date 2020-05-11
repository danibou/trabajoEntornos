import java.util.ArrayList;
import java.util.Random;

public class Metodos {

    public static ArrayList<Fracciones> obtenerFracciones(){
        ArrayList<Fracciones> fracciones = new ArrayList<>();

        Random r = new Random();
        fracciones.add(new Fracciones(r.nextInt(250)+1, r.nextInt(250)+1));
        fracciones.add(new Fracciones(r.nextInt(250)+1, r.nextInt(250)+1));

        return fracciones;
    }
}
