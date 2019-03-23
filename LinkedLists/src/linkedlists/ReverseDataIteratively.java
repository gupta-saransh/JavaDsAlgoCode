/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;


/**
 *
 * @author test
 */
public class ReverseDataIteratively {
    
    public static void main(String args[])
    {
    LinkedList l1= new LinkedList();
    LinkedList l2 = new LinkedList();
    l1.addlast(10);
    l1.addlast(30);
    l1.addlast(50);
    l2.addlast(20);
   l2.addlast(40);
   l2.addlast(60);
LinkedList l3 = new LinkedList();
   l3.mergeTwoLinkedList(l1,l2);

    l3.display();
    

    
  
    

    }
}
