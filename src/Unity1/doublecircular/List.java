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
public class List {
   private  Node head;
    
    public List(){
        head=null;
    }
    public void add(int d){
       Node aux=head , p=head;
        Node n=new Node(d);
        if(head==null){
          head=n;
       } else {
        
        do{    
            p=aux;
            aux=aux.next;
         }while(aux!=head);
            n.next=head;
            head.back=n;
            n.back=p;
            p.back=n;
            
        }
    }
    public void print(){
        Node aux=head;
        do{
            System.out.println(aux.data);
            aux=aux.next; 
        }while(aux!=head);
    }
     
}
