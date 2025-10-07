package gui;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFrame extends JFrame   {
    //how to set a border
    //Border border=BorderFactory.createLineBorder(color,width)
    //label.setBorder(border)
    //frame.pack is used to make the label just take needed widht as frame also

    private JLabel createImageLabel(String caption,String path,int x,int y){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image image=imageIcon.getImage();
        Image resizedImage=image.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon finalImage=new ImageIcon(resizedImage);
        JLabel label=new JLabel();
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setText(caption);
        label.setIcon(finalImage);
        label.setForeground(new Color(210,210,210));
        label.setFont(new Font("MV Boli",Font.PLAIN| Font.BOLD,20));
        label.setBounds(x,y,250,250);

        return label;

    }
    JButton button1;

    MyFrame(){
        ImageIcon buttonIcon=new ImageIcon(getClass().getResource("Resources/plusicon.png"));
        Image buttonIconImage=buttonIcon.getImage();
        Image resizedButtonIconImage=buttonIconImage.getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon finalButtonImageIcon=new ImageIcon(resizedButtonIconImage);

        button1=new JButton();
        button1.setBounds(200,600,150,50);
        button1.setBackground(new Color(106, 93, 206));
        button1.setText("Add yours");
        button1.setFont(new Font("Dialago",Font.PLAIN|Font.BOLD,14));
        button1.setFocusable(false);
        button1.setIcon(finalButtonImageIcon);



        JLabel labelTitle=new JLabel();
        labelTitle.setText("My Top three best drawing");
        labelTitle.setBounds(120,0,400,30);
        labelTitle.setForeground(Color.black);
        labelTitle.setFont(new Font("Dialago",Font.PLAIN|Font.BOLD,27));
        labelTitle.setVerticalTextPosition(JLabel.TOP);
        labelTitle.setHorizontalTextPosition(JLabel.CENTER);
        JLabel label=createImageLabel("The best drawing ever","Resources/picture1.jpg",150,40);
        JLabel label1=createImageLabel("The second drawing ever","Resources/picture2.jpg",0,300);
        JLabel label2=createImageLabel("The Third drawing ever","Resources/picture3.jpg",300,300);

        JLabel labelTitle1=new JLabel();
        labelTitle1.setText("What other think!");
        labelTitle1.setBounds(620,0,400,30);
        labelTitle1.setForeground(Color.black);
        labelTitle1.setFont(new Font("Dialago",Font.PLAIN|Font.BOLD,27));
        labelTitle1.setVerticalTextPosition(JLabel.TOP);
        labelTitle1.setHorizontalTextPosition(JLabel.CENTER);
        JPanel panelOpinion=new JPanel(new FlowLayout());
        panelOpinion.setBounds(620,50,700,700);

       ResultSet set=Read.read(Db.connect());
       try {
           if (set.next()) {
               byte[] imageBytes= set.getBytes("image");
               ImageIcon imageIcon=new ImageIcon(imageBytes);
               Image image=imageIcon.getImage();
               Image resizedImage=image.getScaledInstance(200,200,Image.SCALE_SMOOTH);
               ImageIcon finalImage=new ImageIcon(resizedImage);
               JLabel label3 = new JLabel(finalImage);
               label3.setText(set.getString("name") );
               label3.setHorizontalTextPosition(JLabel.CENTER);
               label3.setVerticalTextPosition(JLabel.BOTTOM);
               panelOpinion.add(label3);


           }
       } catch (SQLException e) {
           e.printStackTrace();
       }








        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.add(labelTitle1);
        this.setSize(600,1000);
        this.setTitle("My first GUI in java");
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(240,240,240,5));
        this.setLayout(null);
        this.add(label);
        this.add(label1);
        this.add(label2);
        this.add(labelTitle);
        this.add(panelOpinion);
        this.add(button1);
        this.setVisible(true);
    }







   /* @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){

            //Create panel
            Border bForm=BorderFactory.createLineBorder(Color.darkGray,3);
            JPanel form1 = new JPanel();
            form1.setLayout(null);
            form1.setBounds(600, 0, 300, 180); // panel position on JFrame
            form1.setBackground(new Color(200, 200, 200)); // optional, for visibility

            // Add label
            JLabel display = new JLabel("What's your best drawing?");
            display.setForeground(Color.black);
            display.setFont(new Font("Dialogo",Font.PLAIN,15));
            display.setBounds(10, 10, 280, 30);
            form1.add(display);

            // Add first text field
            JTextField field1 = new JTextField();
            field1.setBounds(10, 50, 280, 30);
            form1.add(field1);

            // Add second text field
            JTextField field2 = new JTextField();
            field2.setBounds(10, 90, 280, 30);
            form1.add(field2);

            // Add upload button
            JButton upload = new JButton("Upload");
            upload.setBounds(30, 130, 100, 50);
            form1.add(upload);

            // Add panel to JFrame
            this.add(form1);*/


//            display.setBounds(200, 700, 600, 30); // position
//            display.setForeground(Color.BLUE);
//            display.setFont(new Font("Dialago", Font.BOLD, 20));
//            this.add(display);
//            display.setText(displayed);

        }




