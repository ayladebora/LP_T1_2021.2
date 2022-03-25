import java.util.Scanner;

public class TesteLeituraDeNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros");
        String numerosLidos = leitor.nextLine();
        String[] listaNumerosStr = numerosLidos.split(" ");
        int num1 = Integer.parseInt(listaNumerosStr[0]);
        int num2 = Integer.parseInt(listaNumerosStr[1]);
        int num3 = Integer.parseInt(listaNumerosStr[2]);
        int soma = num1 + num2 + num3;
        System.out.print("A soma de " + num1 + " + " + num2 + " + " + num3 + " = " + soma + "\n");
        System.out.printf("A soma de %d + %d + %d = %d\n", num1, num2, num3, soma);

        leitor.close();
    }
}
