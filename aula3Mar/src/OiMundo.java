public class OiMundo {

    public static double calculaMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static void main(String[] args) {
        System.out.println("Oi Mundo!");
        double n1 = 10;
        double n2 = 9.5;
        double n3 = 5;
        System.out.println(calculaMedia(n1, n2, n3));
    }

}