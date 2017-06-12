// Java program to print all root to leaf paths

/* A binary tree node has data, pointer to left child
and a pointer to right child */
import java.util.*;
class TreeNode
{
	int data;
	TreeNode leftChild;
	TreeNode rightChild;
	public TreeNode(int data)
	{
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
}

public class BinaryTree 
{
	TreeNode ROOT;
	public BinaryTree()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		TreeNode node = new TreeNode(1);
		tree.ROOT = node;
		
		node = new TreeNode(2);
		tree.ROOT.leftChild = node;
		
		node = new TreeNode(3);
		tree.ROOT.rightChild = node;
		
		node = new TreeNode(4);
		tree.ROOT.leftChild.leftChild = node;
		
		node = new TreeNode(5);
		tree.ROOT.leftChild.rightChild = node;
		
		node = new TreeNode(6);
		tree.ROOT.rightChild.leftChild = node;
		
		printPaths(tree.ROOT);
		/*for(List<Integer> llst : list)
		{
			for(Integer item : llst)
			{
				System.out.print(item+"\t");
			}
			System.out.println();
		}*/
	}
	
	/* Given a binary tree, print out all of its root-to-leaf
	paths, one per line. Uses a recursive helper to do the work.*/
	public static void printPaths(TreeNode node) 
	{
		int path[] = new int[1000];
		printPathsRecur(node, path, 0);
	}

	/* Recursive helper function -- given a node, and an array containing
	the path from the root node up to but not including this node,
	print out all the root-leaf paths. */
	public static void printPathsRecur(TreeNode node, int path[], int pathLen) 
	{
		if (node == null)
			return;

		/* append this node to the path array */
		path[pathLen] = node.data;
		pathLen++;

		/* it's a leaf, so print the path that led to here */
		if (node.leftChild == null && node.rightChild == null)
			printArray(path, pathLen);
		else
			{ 
			/* otherwise try both subtrees */
			printPathsRecur(node.leftChild, path, pathLen);
			printPathsRecur(node.rightChild, path, pathLen);
		}
	}

	/* Utility that prints out an array on a line */
	public static void printArray(int ints[], int len) 
	{
		int i;
		for (i = 0; i < len; i++) 
			System.out.print(ints[i] + " ");
		System.out.println("");
	}

	
}
