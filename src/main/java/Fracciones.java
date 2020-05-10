public class Fracciones implements Comparable{

    private int den;
    private int num;

    public Fracciones(){
        this.den = 0;
        this.num = 0;
    }

    public Fracciones(int den, int num){
        this.den = den;
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return this.num+"/"+this.den;
    }

    @Override
    public int compareTo(Object o) {
        Fracciones f = (Fracciones) o;
        return 0;
    }
}
