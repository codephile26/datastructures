package edu.ds.linkedlists;

public class DoublyLinkedListTest {
	
	public static void main(String...ar){
		DoublyLinkedList dlList = new DoublyLinkedList();
		System.out.println(dlList.getLength());
		dlList.insertAtBegin(5);
		dlList.insertAtBegin(4);
		dlList.insertAtEnd(6);
		dlList.insert(7,2);
		System.out.println(dlList);
		System.out.println(dlList.getLength());
		dlList.removeData(8);
		System.out.println(dlList);
		System.out.println(dlList.getLength());
		System.out.println(dlList.getElementAt(0));
		System.out.println(dlList.getElementAt(1));
		System.out.println(dlList.getElementAt(2));
		System.out.println(dlList.getElementAt(3));
//		System.out.println(dlList.getElementAt(4));
		System.out.println(dlList.toStringReverse());
		
		
	}

}
