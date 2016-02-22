/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.simplestructures;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main(String [] args){
        List l=new List();
        l.add(5);
        l.add(3);
        l.add(10);
        l.add(20);
        
        System.out.print("INITIAL VALUESS");
        l.print();
        System.out.println(l.Remove(2));
        l.RemoveFirtsElement();
        l.print();
        /*System.out.println(l.Count());
        System.out.println("THE FIRTS ELEMENT IS: ");
        l.PrintFirtsElement();
        System.out.println("THE last ELEMENT IS: ");
        l.PrintLastElement();
                */
                                                                                                                                                                                                     
    }   
}
