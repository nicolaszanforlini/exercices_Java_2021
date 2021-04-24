import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBtnOk implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent event) {

        System.out.println(((JButton) event.getSource()).getText()+" : Clicked");

    }
}
