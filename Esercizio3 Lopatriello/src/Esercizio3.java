import java.util.Scanner;

public class Esercizio3 {
    public static class  Rettangolo {
        Scanner sc = new Scanner(System.in);
        public float h;
        public float b;


    public Rettangolo(float h, float b)
    {
        this.h=h;
        this.b=b;
    }
        public float geth() {return h;}
        public float getb() {return b;}

        public float  perimetro() {return (b+h)*2;}
        public float area() {return (b*h);}




    }
    public static void main(String[] args)
    {
        float h=0;
        float b=0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Digita la base");
        b = sc.nextFloat();

        System.out.println("Digita l'altezza");
        h = sc.nextFloat();


        Rettangolo R1= new Rettangolo(h,b);


        System.out.println("Il perimetro --> "+R1.perimetro());
        System.out.println("L' area --> "+R1.area());
    }

}
