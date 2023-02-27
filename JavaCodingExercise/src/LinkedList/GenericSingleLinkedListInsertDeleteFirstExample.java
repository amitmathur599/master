package LinkedList;

class LinkedListEmptyException extends RuntimeException{
    public LinkedListEmptyException(){
      super();
    }
   
  public LinkedListEmptyException(String message){
      super(message);
    }  
}

/**
*Node class, which holds data and contains next which points to next Node.
*/
class Node<T> {
 public T data; // data in Node.
 public Node<T> next; // points to next Node in list.

 /**
  * Constructor
  */
 public Node(T data){
        this.data = data;
 }

 /**
  * Display Node's data
  */
 public void displayNode() {
        System.out.print( data + " ");
 }
}


/**
* generic Single LinkedList class (Generic implementation)
*/
class LinkedList<T> {
 private Node<T> first; // ref to first link on list

 /**
  * generic Single LinkedList constructor
  */
 public LinkedList(){
        first = null;
 }

 /**
  * Insert New Node at first position of generic Single LinkedList 
  */
 public void insertFirst(T data) {
        Node<T> newNode = new Node<T>(data);  //Creation of New Node.
        newNode.next = first;   //newLink ---> old first
        first = newNode;  //first ---> newNode
 }

 /**
  * Deletes first Node of generic Single LinkedList 
  */
 public Node<T> deleteFirst()
 {
        if(first==null){  //means LinkedList in empty, throw exception.              
               throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
        }
        Node<T> tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
        first = first.next; // delete first Node (make first point to second node)
        return tempNode; // return tempNode (i.e. deleted Node)
 }
 
        
 /**
  * Display generic Single LinkedList 
  */
 public void displayLinkedList() {
        System.out.print("Displaying LinkedList [first--->last]: ");
        Node<T> tempDisplay = first; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
               tempDisplay.displayNode();
               tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println();
        
 }

}



/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
/**
* Main class - To test generic Single LinkedList .
*/
public class GenericSingleLinkedListInsertDeleteFirstExample {
 public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // creation of Linked List
        
        linkedList.insertFirst(11);
        linkedList.insertFirst(21);
        linkedList.insertFirst(59);
        linkedList.insertFirst(14);
        linkedList.insertFirst(39);

        linkedList.displayLinkedList(); // display LinkedList
                     
        System.out.print("Deleted Nodes: ");
        Node<Integer> deletedNode = linkedList.deleteFirst();  //delete Node
        deletedNode.displayNode();                                 //display deleted Node.
        deletedNode = linkedList.deleteFirst();      //delete Node.
        deletedNode.displayNode();                                 //display deleted Node.
        
        System.out.println();// sysout used to format output
        linkedList.displayLinkedList(); //Again display LinkedList
        
        
        

 }
}

/*OUTPUT

Displaying LinkedList [first--->last]: 39 14 59 21 11
Deleted Nodes: 39 14
Displaying LinkedList [first--->last]: 59 21 11

*/


