/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtree;

import java.awt.Graphics;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

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
        System.out.println();
    }
    
    private void PrintLeafs(Node r){
        
        if(r==null) return;
        
        PrintLeafs(r.left);
        if(r.left==null){
         System.out.println(""+r.data);   
        }
         PrintLeafs(r.right);
         if(r.right==null){
            System.out.println(""+r.data);
        }
                           
        
    }
    public int Height() {
        return Height(root);
    }

    private int Height(Node r) {

        if (r == null) {
            return 0;
        }
        int a = Height(r.left);
        int b = Height(r.right);
        return Math.max(a, b) + 1;

    }
     public void Draw(){
      
       JFrame f = new JFrame(){
          public void paint (Graphics g){
              Draw(root,20,40,g);
          } 
       };
       
       f.setSize(600, 400);
       f.setVisible(true);
       f.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   class Info{
       int xroot,xfinal;
   }
   
   private Info Draw(Node r,int x,int y,Graphics g){
       
       Info rootInfo= new Info();
       rootInfo.xfinal=x;
       
       if (r==null) return rootInfo;
       
       Info leftInfo,rightInfo;
       
       leftInfo=Draw(r.left,x,y+40,g);
       
       x=leftInfo.xfinal;
       g.drawOval(x, y, 30, 30);
       g.drawString(""+r.data,x+10,y+20);
       rootInfo.xroot=x;
       
       rightInfo=Draw(r.right,x+30,y+40,g);
       rootInfo.xfinal=rightInfo.xfinal;
       
       if(r.left!=null){
           g.drawLine(rootInfo.xroot+5, y+25,leftInfo.xroot+15, y+40);
       }
       if(r.right!=null){
           g.drawLine(rootInfo.xroot+25, y+25, rightInfo.xroot+15, y+40);
       }
       return rootInfo;
   }
    public int equilibriumFactor() {
        return equilibriumFactor(root);
    }

    private int equilibriumFactor(Node r) {
        return Height(r.left) - Height(r.right);
    }

    private void LeftRotation(Node r, Node handle) {
        if (r == root) {
            root = r.right;
            r.right = root.left;
            root.left = r;
        } else if (r == handle.right) {
            handle.right = r.right;
            r.right = handle.right.left;
            handle.right.left = r;
        } else {
            handle.left = r.right;
            r.right = handle.left.left;
            handle.left.left = r;
        }
    }

    private void RightRotation(Node r, Node handle) {
        if (r == root) {
            root = r.left;
            r.left = root.right;
            root.right = r;
        } else if (r == handle.left) {
            handle.left = r.left;
            r.left = handle.left.right;
            handle.left.right = r;
        } else {
            handle.right = r.left;
            r.left = handle.right.right;
            handle.right.right = r;
        }
    }

    public void balance() {
        balance(root, null);
    }

    private void balance(Node r, Node handle) {
        if (r == null) {
            return;
        }
        balance(r.left, r);
        balance(r.right, r);
        int ef = equilibriumFactor(r);
        if (ef < -1) {
            if (equilibriumFactor(r.right) > 0) {
                RightRotation(r.right, r);
            }
            LeftRotation(r, handle);
        } else if (ef > 1) {
            if (equilibriumFactor(r.left) < 0) {
                LeftRotation(r.left, r);
            }
            RightRotation(r, handle);
        }
    } 

}
