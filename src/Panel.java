import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

public class Panel extends JPanel {

    private int [][] nums; //100x100 =2870; 10x10=37 200x200=11068 500x500=64517 400x400=41762
    private int h=1100;
    private int w=2000;
    private Color [] colors;
    private Random r = new Random();
    private ArrayList<Integer> id= new ArrayList<Integer>();

    public Panel(){

        colors=new Color[h*w];
        nums=new int[w][h];
        for(int i= 1;i<nums.length;i++){
            for(int j =1;j<nums[i].length;j++){
                nums[i][j]= i*j;
                if(colors[nums[i][j]]==null){
                    colors[nums[i][j]]=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
                }
                //if(!id.contains(nums[i][j])){
                    id.add(nums[i][j]);
                //}
            }
        }
        //id.sort(Comparator.comparingInt(Integer::intValue));
        System.out.println(Arrays.toString(id.toArray()));
        System.out.println(id.size());
        repaint();
    }

    private int type=1;

    @Override
    public void paint(Graphics g) {
        for(int i= 1;i<nums.length;i++){
            for(int j =1;j<nums[i].length;j++) {
                switch (type){
                    case 0:

                        if (nums[i][j] % 2 == 0) {
                            g.setColor(Color.BLACK);
                        } else {
                            g.setColor(Color.white);
                        }
                        break;
                    case 1:
                        g.setColor(colors[nums[i][j]]);
                        break;
                    case 2:
                        int h = (int)Integer.parseInt((nums[i][j]+"").substring((nums[i][j]+"").length()-1));
                        g.setColor(colors[h]);
                        break;
                    case 3:
                        int heg = (int) Integer.parseInt((nums[i][j] + "").substring(0, 1));
                        g.setColor(colors[heg]);
                        break;
                }
                g.drawRect(i,j,1,1);
            }
        }
        //g.drawImage(new ImageIcon(createImage(this)).getImage(),0,0,this);

    }



    private BufferedImage createImage(JPanel panel) {

        int w = panel.getWidth();
        int h = panel.getHeight();
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bi.createGraphics();
        panel.paint(g);
        //g.dispose();
        return bi;
    }
}
