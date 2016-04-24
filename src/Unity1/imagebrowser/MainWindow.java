/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.imagebrowser;

import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author AULA1
 */
public class MainWindow extends JFrame {
    private JButton left,right;
    private JButton viewer;
    private ImageStore images;
    
    public MainWindow(){
        
        images = new ImageStore();
        setTitle("set of images");
        setSize(200,100);
        LaunchWidgets();
        LaunchEvents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    
    private void LaunchWidgets(){
        
        left = new JButton("<");
        right = new JButton(">");
        viewer = new JButton();
        add(left,BorderLayout.WEST);
        add(right,BorderLayout.EAST);
        add(viewer,BorderLayout.CENTER);
        
    }
    private void LaunchEvents(){
        
        // when the window is opened
        File folder = new File("C:\\Users\\AULA1\\Downloads\\icons"); 
        for(File file:folder.listFiles()){
            images.add(file.getAbsolutePath());
        }
        
        viewer.setIcon((Icon) images.getCurrent());
        
        //... when the user do a click over the left button.....
        
        left.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(images.goBack()){
                   viewer.setIcon((Icon) images.getCurrent());
               }
            }
        });
        
        //....When the user do click...
        
        right.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(images.goForward()){
                   viewer.setIcon((Icon) images.getCurrent());
               }
            }
        });
        
    }
    public static void main(String args[]){
        new MainWindow();
    }
}
