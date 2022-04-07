import javax.swing.*;

public class TestaTernario {
    public static void main(String [] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        if (nome.equals("Ayla")){
            System.out.println("Pode entrar");
        } else {
            System.out.println("Acesso proibido");
        }


        String mensagem = nome.equals("Ayla")?"Pode entrar":"Acesso proibido";
        System.out.println(mensagem);

    }
}
