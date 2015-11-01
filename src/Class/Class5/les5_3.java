package Class.Class5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by imunelli on 18.10.2015.
 */
public class les5_3 extends JFrame {

    private JPanel panel;

    public les5_3(){
        setTitle("My Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        panel = new JPanel(){
        @Override
        public void paint(Graphics g){
        super.paint(g);
        g.drawRect(0,0,20,60);}
    };


        panel.setBackground(new Color(112, 128, 144));
        add(panel);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Click" + e.getPoint());
                Graphics g = panel.getGraphics();
                g.fillOval(e.getX(),e.getY(), 20,20);
            }
        });


    }


    public static void main(String[] args){
            les5_3 les5_3 = new les5_3();
        les5_3.setVisible(true);




    }

}
