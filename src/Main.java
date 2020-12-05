import javax.swing.*;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {

    public static void main(String[] args) {
	    new Main();
    }

    public static JFrame okno;

    public Main(){
        okno = new JFrame();
        okno.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        okno.setBounds(0,0,1200,700);
        //okno.setBounds(0,0,2000,1100);
        Panel p = new Panel();
        Settings settings = new Settings();
        okno.add(settings);
        //okno.setUndecorated(true);

    }
}
