/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtree;

import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Tree {
     private  Node root;
   
   public Tree(){
       root=null;
   }
   
   public void add (int d){
      Node  n = new Node(d);
      if(root==null){
          root=n;
      }else{
          Node aux = root, p=root;
          while(aux!=null){
              if(d<aux.data){
                  p=aux;
                  aux=aux.left;
              }else if(d>aux.data){
                  p=aux;
                  aux=aux.right;
              }else{
                  return;
              }
                  
          }
          
          if(d< p.data){
              p.left=n;
          }else{
              p.right=n;
          }
      }
      
   }
   
   public void printpath(int d){
       Vector <Node> path = new Vector<Node>();
              Node aux=root;
              while(aux!=null){
                  path.add(aux);
                  if(d>aux.data){
                      aux=aux.right;
                  }else if(d< aux.data){
                      aux=aux.left;
                  }else{
                      for(int i=0; i< path.size();i++){
                          System.out.println(""+path.elementAt(i).data);
                      }
                      System.out.println("");
                      return;
                  }
              }
              System.out.println("DOESN'T EXIST");
   }
   
   public boolean isLeaf(int d){
       
       Node aux=root;
       while(aux!=null){
           if(d>aux.data){
               aux=aux.right;
           }else if(d<aux.data){
               aux=aux.left;
           }else{
               if(aux.right==null&&aux.left==null){
                   return true;
               }else{
                   return false;
               }
           }
       }
       
       return false;
       
   }
   public int max(){
       int max=-1;
       Node aux=root;
       if(root!=null){
           while(aux.right!=null){
               aux=aux.right;
           }
           max=aux.data;
    }
       return max;
   }
   public int min(){
       int min=-1;
       Node aux=root;
       if(root!=null){
           while(aux.left!=null){
               aux=aux.left;
           }
           min=aux.data;
    }
       return min;
   }
     public void print(){
       Node aux=root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
       while(!s.empty()){
           aux=s.pop();
           System.out.println(""+aux.data);
           aux=aux.right;
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
   }
     public int Count(){
       
       int cont=0;
       Node aux=root;
       Stack <Node> s = new Stack <Node>();
       while(aux!=null){
           s.push(aux);
           aux=aux.left;
       }
        while(!s.empty()){
           aux=s.pop();
           cont++;
           aux=aux.right;
           
           while(aux!=null){
               s.push(aux);
               aux=aux.left;
           }
       }
        return cont;
   }
   public void  PreorderPrint(){
       PreorderPrint(root);
       System.out.println();
   }
   private void  PreorderPrint(Node r){
           if(r==null) return;
        
        System.out.println(""+ r.data);
           PreorderPrint(r.left);
            PreorderPrint(r.right);
       
   }
    public void  PostorderPrint(){
       PostorderPrint(root);
       System.out.print("");
   }
   private void  PostorderPrint(Node r){
           if(r==null) return;
        
        System.out.println(""+ r.data);
           PostorderPrint(r.left);
            PostorderPrint(r.right);
       
   }
    
   
   public void recursivePrint(){
        
        recursivePrint(root);
        System.out.println();
        
    }
    
    private void recursivePrint(Node r){
        
        if(r==null) return;
        
        recursivePrint(r.left);
        System.out.println(""+ r.data);
        recursivePrint(r.right);
    }
    
    public int recursiveCount(){
        return recursiveCount(root);
    }
    
    private int recursiveCount(Node r){
    
        if(r==null) return 0;
        
        return recursiveCount(r.left) +
                
        recursiveCount(r.right) +1;
    }
    public void PrintLeafs(){
         PrintLeafs(root);
        
    }
    private void PrintLeafs(Node r){
           if(r==null) return;
        
        
           PrintLeafs(r.left);
          // System.out.println(r.left.data);
           System.out.println(""+r.data);
            PrintLeafs(r.right);
            
            //System.out.println(r.right.data);
    }

}
