package Unity0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AUL         A1
 */
public class Test {
    public static void main (String [] Args){
       TestingStacks();
       TestingQueues();
        
    }
    public static void TestingStacks(){
        System.out.println("..............STACKS TESTING...........");
        Stock s=new Stock();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        s.remove();
        s.print();
        for(int i=2; i<20; i+=2){
            s.add(i);
        }
        s.print();
    }
    public static void TestingQueues(){
        System.out.println("..................QUEUES TESTING....................");
        Queue q=new Queue();
        for(int i=1;i<=20;i++){
           q.add(i);
        }
        System.out.println("INITIAL VALUES");
            q.print();
        
    }
}
