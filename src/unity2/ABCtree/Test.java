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
        int [] datos={12,4,8,19,18,21,3,5,6,7,11,1,2};
        for(int i=0;i<datos.length;i++){
            l.add(datos[i]);
        }
        
        l.Draw();
       // l.max();
       // System.out.println(l.max());
        //System.out.println(l.min());
//        System.out.println("postorder");
//        l.PostorderPrint();
//        System.out.println("preorder");
//        l.PreorderPrint();
        System.out.println("    ========================   ");
        l.PrintLeafs();
    }
}
