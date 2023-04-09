import java.util.Scanner;


public class invertida {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String texto = teclado.nextLine();

        String textoInvertido = " ";

        for (int s = texto.length() - 1; s >= 0; s--) {
            textoInvertido += texto.charAt(s);
        }

        System.out.println("String invertida: " + textoInvertido);

        teclado.close();
    }
}
