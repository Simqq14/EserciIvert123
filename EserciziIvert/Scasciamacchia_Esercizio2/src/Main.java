import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome=sc.nextLine();
        System.out.println("Inserisci il cognome: ");
        String cognome=sc.nextLine();

        System.out.println(nome+" "+cognome+" sei simpatico/a.");
    }
}