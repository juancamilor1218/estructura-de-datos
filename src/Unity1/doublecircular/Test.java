/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.doublecircular;

/**
 *
 * @author Acer
 */
public class Test {
    public static void main (String [] args){
        Unity1.ciruclarlist.List l=new Unity1.ciruclarlist.List();
         l.add(5);
         l.add(10);
         l.add(20);
         l.add(10);
         l.add(5);
       
          System.out.println("initial values");
         l.print();
}
}