/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.grapher ;

import javax.swing.JComponent;

/**
 *
 * @author AULA1
 */
public class Coordinate extends JComponent{
   protected int x;
   protected int y;
   protected Coordinate next;
   protected Coordinate back;
   
   
   public Coordinate(int x,int y){
       next=null;
       back=null;
       this.x=x;
       this.y=y;
       next=back=null;
   }
   
}
