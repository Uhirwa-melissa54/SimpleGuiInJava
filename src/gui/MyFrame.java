package gui;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("Resources/picture1.jpg"));
        Image image=imageIcon.getImage();
        Image resizedImage=image.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon finalImage=new ImageIcon(resizedImage);

        JLabel label=new JLabel();
        label.setHorizontalTextPosition(JLabel.CENTER);
        //how to set a border
        //Border border=BorderFactory.createLineBorder(color,width)
        //label.setBorder(border)
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setText("The best drawing ever");
        label.setIcon(finalImage);
        label.setForeground(new Color(210,210,210));
        label.setFont(new Font("MV Boli",Font.PLAIN| Font.BOLD,20));
        label.setBounds(150,0,250,250);

        JLabel label1=new JLabel();
        ImageIcon imageIcon2=new ImageIcon(getClass().getResource("Resources/picture2.jpg"));
        Image image2=imageIcon2.getImage();
        Image resizedImage2=image2.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon finalImage2=new ImageIcon(resizedImage2);

        label1.setText("The second drawing ever");
        label1.setIcon(finalImage2);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setForeground(new Color(210,210,210));
        label1.setFont(new Font("MV Boli",Font.PLAIN|Font.BOLD,20));
        label1.setBounds(0,300,250,250);

        JLabel label2=new JLabel();
        ImageIcon imageIcon3=new ImageIcon(getClass().getResource("Resources/picture2.jpg"));
        Image image2=imageIcon2.getImage();
        Image resizedImage2=image2.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon finalImage2=new ImageIcon(resizedImage2);

        label2.setText("The second drawing ever");
        label2.setIcon(finalImage2);
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setForeground(new Color(210,210,210));
        label2.setFont(new Font("MV Boli",Font.PLAIN|Font.BOLD,20));
        label2.setBounds(0,300,250,250);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,1000);
        this.setTitle("My first GUI in java");
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(240,240,240,5));
        this.setLayout(null);
        this.add(label);
        this.add(label1);
        this.setVisible(true);
    }
}
