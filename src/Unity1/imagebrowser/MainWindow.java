/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.imagebrowser;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AULA1
 */
public class MainWindow extends JFrame {
     private JButton left;
     private JButton right;
     private JButton viewer;
     private ImageStore images;
     
     public   MainWindow(){
         images =new ImageStore();
         setTitle("IMAGE BROWSER" );
         setSize(200,100 );
         launchWidgets();
         launchEvents();
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
      private void launchWidgets(){
         left=new JButton("<"); 
         right=new JButton(">");
         viewer=new JButton();
         add( left, BorderLayout.WEST);
         add( right, BorderLayout.EAST);
         add( viewer, BorderLayout.CENTER);
         
      }
      private void launchEvents(){
          //CUAND LA VENTANE IS ABIERTA
          File folder =new File("//ruta de una imagen cualquiera dentro del folder");
          for( File file: folder.listFiles() ){
              images.add(file.getAbsolutePath());
          }
          viewer.setIcon(images.getCurrent());
          //izquierdo 
          left.addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  if(images.goBack()){
                      viewer.setIcon(images.getCurrent());
                  }
              }
          });
          right.addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                   if(images.goFoward()){
                      viewer.setIcon(images.getCurrent());
                  }
              }
          });
          
      }
      public static void main(String[]args){
          new MainWindow();
      }
}
