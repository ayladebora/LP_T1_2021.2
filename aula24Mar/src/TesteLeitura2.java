public class TesteLeitura2 {
    public static void main(String[] args) {
        System.out.println("Digite 3 números inteiros");
        String[] listaNumerosStr = { "8", "4", "5" };
        int num1 = Integer.parseInt(listaNumerosStr[0]);
        int num2 = Integer.parseInt(listaNumerosStr[1]);
        int num3 = Integer.parseInt(listaNumerosStr[2]);
        int soma = num1 + num2 + num3;
        System.out.print("A soma de " + num1 + " + " + num2 + " + " + num3 + " = " + soma + "\n");

    }
}
