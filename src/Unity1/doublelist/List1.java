/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.doublelist;

/**
 *
 * @author AULA1
 */
public class List1 {
    Node head=null;
    
    public void add(int d){
        Node n =new Node(d);
        if(head==null){
            head=n;
        } else {
            Node aux=head;
            while(aux.next!=null){
                aux=aux.next;
            }
            aux.next=n;
            n.back=aux;
        }
           
    }
    public void print(){
       Node aux =head;
           while(aux!=null){
               System.out.print(" "+aux.data);
               aux=aux.next;
           }
           System.out.println("");
    }
    public void removeFirts(){
        head=head.next;
        head.back=null;
    }
    public void removeLast(){
       
        Node aux=head;
        while(aux.next!=null){
            aux=aux.next;
        }
        aux=aux.back;
        aux.next=null;
        
        
    }
    public void invert(){
      
    }
    
}
