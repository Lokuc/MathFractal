import javax.swing.*;

import java.awt.*;


public class Settings extends JPanel {

    private int wight=0;
    private JPanel leftSide;
    private Panel p;


    @Override
    public void paint(Graphics g) {
        resize();
        super.paint(g);
    }

    private void resize(){
        if(wight!=getWidth()*0.8){
            wight= (int) (getWidth()*0.8);
            p.setBounds(0,0,wight,getHeight());
            leftSide.setBounds(wight,0,getWidth()-wight,getHeight());
            leftSide.setBackground(Color.GRAY);
        }
    }

    public Settings(){
        p = new Panel();
        setBackground(Color.cyan);
        setLayout(null);
        leftSide=new JPanel();
        add(p);
        add(leftSide);
        repaint();
    }
}

