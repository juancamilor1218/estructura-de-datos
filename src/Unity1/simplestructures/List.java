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
public class List {
    private Node head;
    
    public List(){
        head=null;
    }
    public void add(int d){
        Node n = new Node(d);
        if(head==null){
            head=n;
        } else {
            Node aux=head;
            while(aux.next!=null){
                aux=aux.next;
            }
            aux.next=n;
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
    public int Remove(int p){
        return p;
    }
    public int Count(){
        Node aux=head;
        int counter=0;
         while(aux!=null){
               counter++;
               aux=aux.next;
           }
       return counter;  
    }
}
