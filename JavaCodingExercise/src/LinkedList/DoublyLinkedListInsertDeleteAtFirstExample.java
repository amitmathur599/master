package LinkedList;

class LinkedList1EmptyException extends RuntimeException{
    public LinkedList1EmptyException(){
      super();
    }
   
  public LinkedList1EmptyException(String message){
      super(message);
    }  
}

/**
*Node1 class, which holds data and contains next which points to next Node1.
*/
class Node1 {
 public int data; // data in Node1.
 public Node1 next; // points to next Node1 in list.
 public Node1 previous; // points to previous Node1 in list.

 /**
  * Constructor
  */
 public Node1(int data){
        this.data = data;
 }

 /**
  * Display Node1's data
  */
 public void displayNode1() {
        System.out.print( data + " ");
 }
}


/**
* Doubly LinkedList1 class
*/
class LinkedList1 {
 private Node1 first; // ref to first link on LinkedList1
 private Node1 last; // ref to last link on LinkedList1

 /**
  * Doubly LinkedList1 constructor
  */
 public LinkedList1(){
        first = null;
 }

 
 /**
  * Insert New Node1 at first position of Doubly LinkedList1
  */
 
 public void insertFirst(int data){ // insert at front of list
        Node1 newNode1 = new Node1(data); // creation of new Node1.
        if (first == null) // means LinkedList1 is empty.
               last = newNode1; //  newNode1 <--- last
        else
               first.previous = newNode1; // newNode1 <-- old first
        newNode1.next = first; // newNode1 --> old first
        first = newNode1; // first --> newNode1
 }

 /**
  * Delete first Node1 of Doubly LinkedList1.
  */
 public Node1 deleteFirst() { 
             
        if(first==null){  //means LinkedList1 in empty, throw exception.              
               throw new LinkedList1EmptyException("LinkedList1 doesn't contain any Node1s.");
        }

        Node1 tempNode1 = first;
        if (first.next == null) // if only one item
               last = null; // null <-- last
        else
               first.next.previous = null; // null <-- old next
        first = first.next; // first --> old next
        return tempNode1;
 }

 
 /*
  * Display Doubly LinkedList1 in forward direction
  */
 public void displayFrwd() {
        System.out.print("Displaying in forward direction [first--->last] : ");
        Node1 tempDisplay = first; // start at the beginning of LinkedList1
        while (tempDisplay != null){ // Executes until we don't find end of list.
               tempDisplay.displayNode1();
               tempDisplay = tempDisplay.next; // move to next Node1
        }
        System.out.println("");
 }


 /*
  * Display Doubly LinkedList1 in backward direction
  */
 public void displayBckwrd() {
        System.out.print("Displaying in backward direction [last-->first] : ");
        Node1 tempDisplay = last; // start at the end of LinkedList1
        while (tempDisplay != null) {// Executes until we don't find start of list.    
               tempDisplay.displayNode1();
               tempDisplay = tempDisplay.previous; // move to previous Node1
        }
        System.out.println("");
 }
 

}




/** Copyright (c), AnkitMittal www.JavaMadeSoEasy.com */ 
/**
* DoublyLinkedList1InsertDeleteAtFirstExample - Main class - To test Doubly LinkedList1.
*/
public class DoublyLinkedListInsertDeleteAtFirstExample {
 public static void main(String[] args) {
        LinkedList1 LinkedList1 = new LinkedList1(); // creation of Linked List
        
        LinkedList1.insertFirst(11);
        LinkedList1.insertFirst(21);
        LinkedList1.insertFirst(59);
        LinkedList1.insertFirst(14);
        LinkedList1.insertFirst(39);

        LinkedList1.displayFrwd(); // display DoublyLinkedList1
        LinkedList1.displayBckwrd();
                     
        System.out.print("Deleted Node1s: ");
        Node1 deletedNode1 = LinkedList1.deleteFirst(); //delete Node1
        deletedNode1.displayNode1();                                 //display deleted Node1.
        deletedNode1 = LinkedList1.deleteFirst();      //delete Node1.
        deletedNode1.displayNode1();                                 //display deleted Node1.
        
        System.out.println();// sysout used to format output
        
        LinkedList1.displayFrwd(); // display DoublyLinkedList1
        LinkedList1.displayBckwrd();
        
        

 }
}

/*OUTPUT

Displaying in forward direction [first--->last] : 39 14 59 21 11
Displaying in backward direction [last-->first] : 11 21 59 14 39
Deleted Nodes: 39 14
Displaying in forward direction [first--->last] : 59 21 11
Displaying in backward direction [last-->first] : 11 21 59

*/
