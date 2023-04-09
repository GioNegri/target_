import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Digite um numero inteiro: ");
        int num = teclado.nextInt();

        int fib = 0;
        int fib1 = 0;
        int fib2 = 1;

        while (fib <num){
            fib = fib1+fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        if (fib == num) {
            System.out.println(num + "pertence à sequencia de Fibonacci!");
        }else{
            System.out.println(num + "não pertence");
        }
        teclado.close();
    }
}
