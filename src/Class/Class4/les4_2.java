package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by imunelli on 04.10.2015.
 */
public class les4_2 {
    //AWT
    //SWING
    //JavaFX

    public static void main(String[] args){
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setTitle("Swing frame");
        frame.setSize(250, 250);

        JButton button = new JButton("click me");
        frame.add(button);//,BorderLayout.PAGE_START);
        button.setSize(100, 200); //  игнорируется если не задаём размер при передаче в фрейм
        frame.setLayout(null);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"piy piy");
            }
        });



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
