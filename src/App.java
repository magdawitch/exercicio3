import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //1: Pedir 2 números

        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();

        sc.close();

        //2: Imprimir a soma dos números
        int soma = x + y;

        System.out.println("A soma dos dois números é: " + soma);


    }
}
