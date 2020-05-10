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




        while(opcion != 0){

            //RESETEAMOS VARIABLES
            Fracciones resultado;
            Fracciones userResult = new Fracciones();

            int num;
            int den;
            ArrayList<Integer> descomposicionF1;
            ArrayList<Integer> descomposicionF2;
            String descomposicion1 = "";
            String descomposicion2 = "";

            System.out.print("\n\nF1: "+f1 + " - F2:" + f2);
            inicio();
            opcion = EntradaEntero();
            switch (opcion){
                case 1:
                    int mcd = CalculosMatematicos.maxComDiv(f1.getDen(),f2.getDen());
                    System.out.println("El M.C.D de " + f1.getDen() + ", " + f2.getDen() + " es: " + mcd);
                    break;
                case 2:
                    int mcm = CalculosMatematicos.minComMultiplo(f1.getDen(),f2.getDen());
                    System.out.println("El M.C.M de " + f1.getDen() + ", " + f2.getDen() + " es: " + mcm);
                    break;
                case 3:
                    System.out.print("SUMA O RESTA:");
                    String operacion = EntradaPalabra().toUpperCase();
                    if(operacion.equalsIgnoreCase("SUMA")){

                        System.out.print(f1.getNum()+"/"+f1.getDen() + " + " + f2.getNum()+"/"+f2.getDen());
                        System.out.println("\nSimplificado = SIMPLIFICADO o sin simplificar = SIN_SIMPLIFICAR: ");
                        String simplificado = EntradaPalabra().toUpperCase();

                        if(simplificado.equalsIgnoreCase("SIMPLIFICADO")){

                            System.out.print("Resultado: \n Numerador: ");
                            num = EntradaEntero();

                            System.out.print(" Denominador: ");
                            den = EntradaEntero();

                            userResult.setNum(num);
                            userResult.setDen(den);
                            resultado = CalculosMatematicos.sumaDeFracciones(f1,f2);
                            CalculosMatematicos.simplificarFraccion(resultado);

                            if(resultado.equals(userResult))
                                System.err.println("Respuesta correcta!");
                            else
                                System.err.println("Respuesta Incorrecta!");
                        }else if(simplificado.equalsIgnoreCase("SIN_SIMPLIFICAR")){

                            System.out.print("Resultado: \n Numerador: ");
                            num = EntradaEntero();

                            System.out.print(" Denominador: ");
                            den = EntradaEntero();

                            userResult.setNum(num);
                            userResult.setDen(den);
                            resultado = CalculosMatematicos.sumaDeFracciones(f1,f2);

                            if(resultado.equals(userResult))
                                System.err.println("Respuesta correcta!");
                            else
                                System.err.println("Respuesta Incorrecta!");

                        }else{
                            System.err.println("Opcion incorrecta!");
                        }

                    }else if(operacion.equalsIgnoreCase("RESTA")){

                        System.out.print(f1.getNum()+"/"+f1.getDen() + " - " + f2.getNum()+"/"+f2.getDen());
                        System.out.println("\nSimplificado = SIMPLIFICADO o sin simplificar = SIN_SIMPLIFICAR: ");
                        String simplificado = EntradaPalabra().toUpperCase();

                        if(simplificado.equalsIgnoreCase("SIMPLIFICADO")){

                            System.out.print("Resultado: \n Numerador: ");
                            num = EntradaEntero();

                            System.out.print(" Denominador: ");
                            den = EntradaEntero();

                            userResult.setNum(num);
                            userResult.setDen(den);
                            resultado = CalculosMatematicos.restaDeFracciones(f1,f2);
                            CalculosMatematicos.simplificarFraccion(resultado);

                            if(resultado.equals(userResult))
                                System.err.println("Respuesta correcta!");
                            else
                                System.err.println("Respuesta Incorrecta!");

                        }else if(simplificado.equalsIgnoreCase("SIN_SIMPLIFICAR")){

                            System.out.print("Resultado: \n Numerador: ");
                            num = EntradaEntero();

                            System.out.print("Denominador: ");
                            den = EntradaEntero();

                            userResult.setNum(num);
                            userResult.setDen(den);
                            resultado = CalculosMatematicos.restaDeFracciones(f1,f2);

                            if(resultado.equals(userResult))
                                System.err.println("Respuesta correcta!");
                            else
                                System.err.println("Respuesta Incorrecta!");

                        }else{
                            System.err.println("Opcion incorrecta!");
                        }

                    }else{
                        System.err.println("Opcion incorrecta!");
                    }

                    break;
                case 4:
                    CalculosMatematicos.simplificarFraccion(f1);
                    CalculosMatematicos.simplificarFraccion(f2);
                    System.out.println("Fracciones Simplificadas");
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Introduzca el numero a descomponer: ");
                    num = EntradaEntero();
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
