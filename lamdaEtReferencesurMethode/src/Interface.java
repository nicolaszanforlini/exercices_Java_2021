import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interface extends JFrame{

    JButton btnLamda1 = new JButton("Ok lamda1");

    public Interface(){

        super("Hello");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        btnLamda1.setBackground(Color.GREEN);
        panel.add(btnLamda1);

        // expression lambda 1 ===============================

        //btnLamda1.addActionListener((e) -> System.out.println("OK 1 : " + ((JButton)e.getSource()).getText()));

        // expression lambda 2 ===============================
/*
        btnLamda1.addActionListener((e) -> {
            System.out.println("OK 2 : " + ((JButton)e.getSource()).getText());
            btnLamda1.setText("text changer !!! ");
            btnLamda1.setBackground(Color.YELLOW);
        });

 */
        // reference sur methode, voir la methode plus bas ==========================

        btnLamda1.addActionListener(this::btnLamdaClick);

        //======================================================

        this.setSize(600,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    // reference sur methode =======================

    public void btnLamdaClick(ActionEvent a){
        System.out.println("lamda par methode : "+ ((JButton) a.getSource()).getText());
    }

    //=====================================================

    public static void main(String[] args) {
        new Interface();
    }

}
