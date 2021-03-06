import java.util.ArrayList;

public class CalculosMatematicos {

    public static boolean esPar(int num){
        return num%2 == 0;
    }

    public static ArrayList<Integer> descomposicionEnNumPrimos(int num){
        ArrayList<Integer> divisores = new ArrayList<>();
        int i;

        for(i = 2; i<=num; i++){
            if (esPrimo(i)){
                while (num%i==0){
                    divisores.add(i);
                    num = num/i;
                }
            }
        }

        return divisores;
    }

    public static boolean esPrimo(int num){

        int contD = 0;

        if(num != 2 && num % 2 == 0)
            return false;

        for(int i = num; i>0; i--){
            if(num % i == 0)
                contD++;

        }

        return contD <= 2;
    }


    // HECHO POR DANIEL
    public static int maxComDiv (int num, int num2){
        while (num!=num2) {
            if (num>num2) {
                num=num-num2;
            }else {
                num2= num2-num;
            }
        }
        return num;
    }

    //HECHO POR DANIEL
    public static void simplificarFraccion (Fracciones f){

        boolean neg = false;
        if(f.getNum() < 0){
            f.setNum(-1*f.getNum());
            neg = true;
        }

        int max = maxComDiv(f.getNum(),f.getDen());
        while (max>1) {
            f.setNum(f.getNum() / max);
            f.setDen(f.getDen() / max);

            max = maxComDiv(f.getNum(), f.getDen());
        }

        if(neg)
            f.setDen(-1*(f.getDen()));

    }

    //HECHO POR CARLOS
    public  static int minComMultiplo(int num, int num2){
        int mcm;
        int a = Math.max(num, num2);
        int b = Math.min(num, num2);
        mcm = (a/maxComDiv(a, b))*b;
        return mcm;
    }

    //HECHO POR CARLOS
    public static Fracciones sumaDeFracciones(Fracciones f1, Fracciones f2){
        Fracciones resultado = new Fracciones();
        resultado.setDen(f1.getDen()*f2.getDen());
        resultado.setNum((f1.getNum()*f2.getDen()) + (f2.getNum()*f1.getDen()));

        return resultado;
    }

    //HECHO POR CARLOS
    public static Fracciones restaDeFracciones(Fracciones f1, Fracciones f2){
        Fracciones resultado = new Fracciones();
        resultado.setDen(f1.getDen()*f2.getDen());
        resultado.setNum((f1.getNum()*f2.getDen()) - (f2.getNum()*f1.getDen()));

        return resultado;
    }

    // HECHO POR CARDIN
    public static Fracciones multiplicacionFracciones(Fracciones f1, Fracciones f2){
        Fracciones resultado=new Fracciones();

        resultado.setNum(f1.getNum()*f2.getNum());
        resultado.setDen(f1.getDen()*f2.getDen());


        return resultado;
    }

    // HECHO POR CARDIN
    public static Fracciones divisionFracciones(Fracciones f1, Fracciones f2){
        Fracciones resultado=new Fracciones();

        resultado.setNum(f1.getNum()*f2.getDen());
        resultado.setDen(f1.getDen()*f2.getNum());


        return resultado;
    }
}
