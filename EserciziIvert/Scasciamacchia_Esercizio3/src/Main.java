import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Inserisci la base del rettangolo: ");
        String base=sc.nextLine();
        System.out.println("Inserisci l'altezza del rettangolo: ");
        String altezza=sc.nextLine();

        perimetro(int altezza, int base);
        System.out.println("Il perimetro del rettangolo è: ");
    }

    float perimetro(int altezza, int base)
    {
        int perimetro=(base*altezza);
        return perimetro;
    }

    public static void area(int altezza, int base)
    {
        int area=(base*2)+(altezza*2);
    }
}