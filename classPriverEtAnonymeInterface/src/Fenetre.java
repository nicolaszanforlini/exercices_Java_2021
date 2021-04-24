import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {

    private JButton btnOk = new JButton("Ok");
    private JButton btnCancel = new JButton("Cancel");
    private JButton btnUpdate = new JButton("Update");
    private JButton btnAnonyme = new JButton("btn anonyme");

    public Fenetre(){

        super("Mon Titre");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = (JPanel) this.getContentPane();
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        btnOk.setBackground(Color.YELLOW);
        btnCancel.setBackground(Color.BLUE);
        btnUpdate.setBackground(Color.GREEN);
        btnAnonyme.setBackground(Color.PINK);

        panel.add(btnOk);
        panel.add(btnCancel);
        panel.add(btnUpdate);
        panel.add(btnAnonyme);

        btnOk.addActionListener(new BtnOkClickedInner());
        //btnOk.addActionListener(new ActionBtnOk());
        btnCancel.addActionListener(new ActionBtnCancel());
        btnUpdate.addActionListener(new ActionBtnUpdate());

        // btn avec classe anonyme ===================================

        btnAnonyme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(((JButton) e.getSource()).getText()+" clicked avec class anonyme");
                Fenetre.this.btnAnonyme.setBackground(Color.LIGHT_GRAY);
            }
        });

        // ===========================================================
        this.setSize(600,300);
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setVisible(true);

    }



    public static void main(String[] args) {
        new Fenetre ();
    }

    // Class interne ===============================

    private class BtnOkClickedInner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent eventInner) {
            System.out.println(((JButton) eventInner.getSource()).getText()+" : Clicked in Inner");
            setTitle("Inner Clicked");
        }
    }
    //===============================================


}
