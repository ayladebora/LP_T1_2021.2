public class SalariosRuins {
    public static void main(String[] args) {
        double[] salariosSemanais = { 400.00, 380.30, 100.00, 1000.00 };
        System.out.println("Quantidade de salários baixos:"+ ProgramaFuncionarios2.contaSalariosBaixos(salariosSemanais));
    }

    // Declaração do método "contaSalariosBaixos"
    public static int contaSalariosBaixos(double [] valores){
        int cont = 0;
        for (int k=0 ; k< valores.length; k++){
            if (valores[k]<400){
                cont++;
            }
        }
        return cont;
    }

}
