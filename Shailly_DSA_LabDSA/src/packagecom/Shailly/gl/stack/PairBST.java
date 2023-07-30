package packagecom.Shailly.gl.stack;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
		left=right=null;
	}
	
}

public class PairBST {
	Node root;
	
	public static void main (String[] args)
	{
		PairBST bst = new PairBST();
		bst.root = bst.insert (bst.root,40);
		bst.root = bst.insert(bst.root, 20);
		bst.root = bst.insert (bst.root,60);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert (bst.root,30);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert (bst.root,70);
		bst.inOrderTraverse(bst.root);
		int targetSum = 130;
		bst.findPairWithGivenSum(bst.root, targetSum);
	
	}

	private void findPairWithGivenSum(Node root, int targetSum) {
		
		Set<Integer> set = new HashSet<>();
		if (!findPairUtil(root,targetSum,set)) {
			System.out.println("Nodes are not found");
		
	}
}

	private boolean findPairUtil(Node root, int targetSum, Set<Integer> set) {
		// TODO Auto-generated method stub
		if(root == null)
			return false;
		
		if (findPairUtil(root.left,targetSum,set))
			return true;
		
		int diff = targetSum - root.data;
		if(set.contains(diff)) {
			System.err.println("Pair is ("+ diff + ", " + root.data + ")");
			return true;
		}
		else
			set.add(root.data);
		
		return findPairUtil(root.right,targetSum,set);
		
	}

	private void inOrderTraverse(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		inOrderTraverse(root.left);
		inOrderTraverse(root.right);		
		
	}

	private Node insert(Node node, int key) {
		// TODO Auto-generated method stub
		if(node==null) {
			node = new Node (key);
			return node;
		}
		
		if (key<node.data)
			node.left =insert(node.left,key);
		else if (key>node.data)
			node.right = insert (node.right, key);
		return node;
	}
	
}
	
