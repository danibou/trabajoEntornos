import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

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



}
