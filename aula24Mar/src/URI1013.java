import java.util.Scanner;

public class URI1013 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String numerosLidosStr = leitor.nextLine();
        String[] numerosLidosArray = numerosLidosStr.split(" ");
        int a = Integer.parseInt(numerosLidosArray[0]);
        int b = Integer.parseInt(numerosLidosArray[1]);
        int c = Integer.parseInt(numerosLidosArray[2]);
        if (a >= b && a >= c) {
            System.out.printf("%d eh o maior\n", a);
        } else if (c >= b) {
            System.out.printf("%d eh o maior\n", c);
        } else {
            System.out.printf("%d eh o maior\n", b);
        }

        /*
         * if (a >= b) {
         * if (a >= c) {
         * System.out.printf("%d eh o maior\n", a);
         * } else {
         * System.out.printf("%d eh o maior\n", c);
         * }
         * } else { // b>a
         * if (b >= c) {
         * System.out.printf("%d eh o maior\n", b);
         * } else {
         * System.out.printf("%d eh o maior\n", c);
         * }
         * 
         * }
         * 
         */

        leitor.close();
    }
}
