import java.util.ArrayList;
import java.util.Scanner;

public class Consola {

    private static Scanner teclado = new Scanner(System.in);

    public static String EntradaPalabra(){
        return teclado.next();
    }

    public static String EntradaLinea(){
        return teclado.nextLine();
    }

    public static Integer EntradaEntero(){
        int num;
        while(!teclado.hasNextInt()){
            System.err.println(teclado.next() + " no es un numero valido!");
        }
        num = Integer.parseInt(teclado.next());

        return num;
    }

    public static void inicio(){
        System.out.println("\n\nOpciones:\n" +
                "1.- M.C.D(Maximo Comun Divisor).\n" +
                "2.- M.C.M(Minimo Comun Multiplo).\n" +
                "3.- Suma (o resta).\n" +
                "4.- Simplificacion.\n" +
                "5.- Division.\n" +
                "6.- Multiplicacion.\n" +
                "7.- Descomposicion en numeros primos.\n" +
                "0.- CERRAR");
    }

    public  static void App(){
        int opcion = 1;

        ArrayList<Fracciones> f = Metodos.obtenerFracciones();

        Fracciones f1 = f.get(0);
        Fracciones f2 = f.get(1);
        Fracciones resultado = new Fracciones();

        while(opcion != 0){
            inicio();
            opcion = EntradaEntero();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("SUMA O RESTA:");
                    String operacion = EntradaPalabra().toUpperCase();
                    if(operacion.equalsIgnoreCase("SUMA")){
                        System.out.print(f1.getNum()+"/"+f1.getDen() + " + " + f2.getNum()+"/"+f2.getDen());

                    }else if(operacion.equalsIgnoreCase("RESTA")){
                        System.out.print(f1.getNum()+"/"+f1.getDen() + " - " + f2.getNum()+"/"+f2.getDen());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Introduzca el numero a descomponer: ");
                    int num = EntradaEntero();
                    ArrayList<Integer> descomposicion = CalculosMatematicos.descomposicionEnNumPrimos(num);
                    for(int i = 0; i<descomposicion.size(); i++){
                        System.out.println(num + " | " + descomposicion.get(i));
                        num = num/descomposicion.get(i);
                    }
                    break;
                default:
                    break;
            }

        }
        teclado.close();
    }
}
