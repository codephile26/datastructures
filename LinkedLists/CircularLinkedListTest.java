package edu.ds.linkedlists;

public class CircularLinkedListTest {
	
	public static void main(String...ar){
		CircularLinkedList listCircular = new CircularLinkedList();
		System.out.println(listCircular.getLength());
		listCircular.addToBeginning(1);
		System.out.println(listCircular);
		listCircular.addToBeginning(2);
		System.out.println(listCircular);
		listCircular.addToBeginning(3);
		System.out.println(listCircular);
		System.out.println(listCircular.getLength());
		listCircular.addToEnd(0);
		listCircular.addToEnd(-1);
		System.out.println(listCircular);
		listCircular.removeFromEnd();
		System.out.println(listCircular);
	}

}
