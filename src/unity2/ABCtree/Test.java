/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtree;

/**
 *
 * @author juan
 */
public class Test {
    public static void main(String Args[]){
        Tree l= new Tree();
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(6);
        l.add(4);
        l.add(2);
        l.max();
        System.out.println(l.max());
        System.out.println(l.min());
    }
}
