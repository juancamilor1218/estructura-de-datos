/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.AVLtree;

/**
 *
 * @author Acer
 */
public class Node {
    protected int data;
    protected int height;
    protected Node right;
    protected Node left;
    
    public Node(int d){
        height=0;
        data=d;
        right=null;
        left=null;
    }
}
