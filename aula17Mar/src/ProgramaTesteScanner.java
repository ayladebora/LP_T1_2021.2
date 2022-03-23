import java.util.Scanner;

public class ProgramaTesteScanner {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // System.out.println("Digite A");
        String strA = leitor.nextLine();
        int a = Integer.parseInt(strA);
        // System.out.println("Digite B");
        String strB = leitor.nextLine();
        int b = Integer.parseInt(strB);
        int x = a + b;
        System.out.println("X = " + x);
        leitor.close();
    }

}
