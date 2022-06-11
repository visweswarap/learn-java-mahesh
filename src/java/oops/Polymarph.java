package oops;

public class Polymarph {
    int i, j, k,l;

    public void add(int i, int j, int k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
        int l = i + j + k;
        System.out.println("ADDITION OF THREE NUMBERS IS : " + l);
    }
    public void add(int i, int j, int k, int l)
    {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        int m = i + j + k + l;
        System.out.println("ADDITION OF FOUR NUMBERS IS : " + m);
    }
    public void multiple(int i,int j,int k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
        System.out.println("MULTIPLICATION OF THREE NUMBERS IS :"+(i*j*k));
    }
    public void multiple(int i,int j,int k,int l)
    {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        System.out.println("MULTIPLICATION OF FOUR NUMBERS IS :"+(i*j*k*l));
    }
}


