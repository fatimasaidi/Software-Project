import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;

public class Class2 extends JFrame{
    public static  void main (String args[]) {
        JFrame class1 =new JFrame ();
        class1.setTitle("hello");
        class1.setSize(540,540);
        class1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        class1.setLayout(new FlowLayout());
        JLabel label1=new JLabel();
        label1.setText("misk");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        ImageIcon IMG= new ImageIcon("misk.jpg");
        label1.setIcon(IMG);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        class1.add(label1);
        class1.setVisible(true);


    }


}
