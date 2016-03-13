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
    public int Remove(int i){
        int data=-1;
        if(head==null) {
            
        }
        if(i==0){
            head=head.next;   
        } else {
        Node aux =head , p=null;
        int counter=0;
        for(;counter<i && aux!=null;counter++){
            p=aux;
            aux=aux.next;
            
        }
        data=aux.data;
        if(aux!=null){
            p.next=aux.next;
        }
        }
        return data;
        
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
    public void PrintFirtsElement(){
       if(head!=null){ 
        System.out.print(head.data);
       } else {
           System.out.println("-1");
       }
       
       
    }
    public void PrintLastElement(){
        Node aux=head;
        if(aux.next!=null){
             while(aux.next!=null){
               aux=aux.next;
             }
             System.out.println(aux.data);
        } else {
            System.out.println("-1");
        }
         
    }
    public void RemoveFirtsElement(){
        head=head.next;
    }
    public void RemoveLastElement(){
        Node aux=head, p=null;
        while(aux.next!=null){
            p=aux;
            aux=aux.next;
        }
        p.next=null;
    }
     public void removeIntercaled(){
       Node aux= head,p=head;
        int c=Count();
        for(int i=0;i<c;i++){
            if(i%2==1){
                p.next=aux.next;
            }
            p=aux;
            aux=aux.next;
        }
    }
    public void DuplicateIntercaled(){
        Node aux= head,p=head;
        int c=Count();
        while (aux.next != null){
            Node n=new Node(aux.data);
            n.next=aux.next;
            aux.next=n;
            aux=n.next;
        }
    }
    public void Invert(){
        Node aux= head,head2=null;
        while(head!=null){
            aux=head;
            head=head.next;
            aux.next=head2.next;
            head2.next=aux;
        }
        head=head2;
    }
    public void RemoveRecurrents(){
        Node p =head, aux=head, back=head;
        while(aux.next!=null){
            p=head;
            while(p!=aux){
                if(p.data==aux.data){
                    back.next=aux.next;
                    back=aux;
                }
                p=p.next;
            }
            back=aux;
            aux=aux.next;
        }
    }
    
    public void InsertZeros(){
        Node aux=head;
        int  c=Count();
        for(int i=0;i<c-1;i++){
            Node n=new Node(0);
            n.next=aux.next;
            aux.next=n;
            aux=n.next;
        }
    }
    
    public void removeMiddle(){
        Node aux= head , back =head;
        int c=Count();
        int half=c/2;
        
         for(int i=0;i<half;i++){
             back=aux;
             aux=aux.next;
             
         }
         back.next=aux.next;   
    }
    public int countOdds(){
        Node aux= head; 
        int cont=0;
        while(aux.next!=null){
            if(aux.data%2!=0){
                cont++;
            }
            aux=aux.next;
        }
        return cont;
    }
}
