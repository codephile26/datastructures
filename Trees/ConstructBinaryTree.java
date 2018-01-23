package edu.ds.trees;

public class ConstructBinaryTree {

	public static BinaryTreeNode buildBTFromInorderAndPreOrder(int [] preorder, int [] inorder){
		if (preorder.length == 0 || inorder.length !=preorder.length || inorder.length == 0){
			return null;
		}
		return buildBinaryTreeFromInorderPreOrder(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	}

	private static BinaryTreeNode buildBinaryTreeFromInorderPreOrder(int[] preorder, int preStart, int preEnd,
			int[] inOrder, int inStart, int inEnd) {
		if (preStart>preEnd || inStart>inEnd){
			return null;
		}
		int data = preorder[preStart];
		BinaryTreeNode cur = new BinaryTreeNode(data);
		int offset = inStart;
		for(;offset<inEnd;offset++){
			if(inOrder[offset] == data){
				break;
			}
		}
		cur.setLeft(buildBinaryTreeFromInorderPreOrder(preorder, preStart + 1, preStart + offset, inOrder, inStart, offset - 1));
		cur.setRight(buildBinaryTreeFromInorderPreOrder(preorder, preStart + offset + 1, preEnd, inOrder, offset+1, inEnd));
		return cur;
	}
	
	public static void main(String [] args){
		BinaryTree tree = new BinaryTree();
		int [] inOrder = {4,2,5,1,6,3};
		int [] postOrder = {4,5,2,6,3,1};
		tree.setRoot(buildBTInorderPostOrder(postOrder, inOrder));
		tree.inOrder(tree.getRoot());
		
	} 
	
	public static BinaryTreeNode buildBTInorderPostOrder(int[] postOrder,int [] inOrder){
		if (postOrder.length == 0 || inOrder.length == 0 || postOrder.length != inOrder.length){
			return null;
		}
		
		return buildBinaryTreeInOrderPostOrder(postOrder,0,postOrder.length - 1,inOrder, 0, inOrder.length - 1);
	}

	private static BinaryTreeNode buildBinaryTreeInOrderPostOrder(int[] postOrder, int postStart, int postEnd, int [] inOrder, int inStart, int inEnd) {
		if (postEnd < postStart || inEnd < inStart){
			return null;
		}
		int val = postOrder[postEnd];
		BinaryTreeNode curr = new BinaryTreeNode(val);
		int offset = inStart;
		for (;offset<inEnd;offset++){
			if (inOrder[offset] == val){
				break;
			}
		}
		curr.setLeft(buildBinaryTreeInOrderPostOrder(postOrder, postStart, postStart + offset - inStart - 1, inOrder, inStart, offset - 1));
		curr.setRight(buildBinaryTreeInOrderPostOrder(postOrder, postStart + offset - inStart, postEnd - 1, inOrder, offset + 1, inEnd));
		return curr;
	}

}
