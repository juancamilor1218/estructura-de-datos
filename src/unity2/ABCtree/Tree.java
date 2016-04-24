/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtree;

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
}
