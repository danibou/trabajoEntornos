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
        if(this.num > f.num && this.den>f.den || this.num>f.num && this.den<f.den)
            return 1;
        if(this.num< f.num && this.den<f.den ||this.num<f.num && this.den>f.den)
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Fracciones f = (Fracciones) obj;

        if(f.num == this.num && f.den == this.den)
            return true;
        else
            return false;
    }
}
