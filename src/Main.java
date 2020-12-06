import javax.swing.*;


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
        Settings settings = new Settings();
        okno.add(settings);
        settings.setBounds(0,0,okno.getWidth(),okno.getHeight()-16);
        //okno.setUndecorated(true);
        okno.setVisible(true);
    }
}
