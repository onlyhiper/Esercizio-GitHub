import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();

        salutaUtente(nome);
        input.close();
    }

    public static void salutaUtente(String nome) {
        System.out.println("Ciao, " + nome + "!");
    }
}
