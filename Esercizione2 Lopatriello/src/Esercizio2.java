import java.util.Scanner;

public class Esercizio2 {
    public static <string> void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserisci il Nome");
        String nome=sc.nextLine();

        System.out.println("Inserisci il Cognome");
        String cognome=sc.nextLine();

        System.out.println((nome + cognome) + "è bravo" );
    }
}
