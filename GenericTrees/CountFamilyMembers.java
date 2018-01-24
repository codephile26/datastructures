package edu.ds.generictrees;

public class CountFamilyMembers {
	
	public static int countSiblings(GenericTreeNode current){
		int count = 0;
		while(current != null){
			count++;
			current = current.getNextSibling();
		}
		return count;
	}
	
	public static int countChildren(GenericTreeNode current){
		if (current == null){
			return 0;
		}
		int count = 0;
		current = current.getFirstChild();
		while(current != null){
			count++;
			current = current.getNextSibling();
		}
		return count;
	}

}
