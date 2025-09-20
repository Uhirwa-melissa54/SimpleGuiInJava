package gui;

import javax.swing.*;
import java.io.File;

public class Form extends JFrame {
    public static void main(String[] args){

    JTextField username=new JTextField();
    JFileChooser fileChooser = new JFileChooser();


    int result = fileChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION){

        File selectedFile = fileChooser.getSelectedFile();
    }

}}
