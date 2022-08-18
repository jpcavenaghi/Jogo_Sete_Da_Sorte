import view.FrmJogo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setTitle("Jogo 7 Da Sorte");
        tela.setSize(500, 500);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setContentPane(new  FrmJogo().getPanelGame());
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}