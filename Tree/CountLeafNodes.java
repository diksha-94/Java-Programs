//Simple tree creation
/*			1
		   / \
		  2	  3
		 / \  /
		4   5 6
*/
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
public class CountLeafNodes
{
	TreeNode ROOT;
	public CountLeafNodes()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		CountLeafNodes tree = new CountLeafNodes();
		TreeNode node = new TreeNode(10);
		tree.ROOT = node;
		
		node = new TreeNode(20);
		tree.ROOT.leftChild = node;
		
		node = new TreeNode(30);
		tree.ROOT.rightChild = node;
		
		node = new TreeNode(40);
		tree.ROOT.leftChild.leftChild = node;
		
		node = new TreeNode(50);
		tree.ROOT.leftChild.rightChild = node;
		
		node = new TreeNode(60);
		tree.ROOT.rightChild.leftChild = node;
		
		node = new TreeNode(70);
		tree.ROOT.rightChild.rightChild = node;
		
		node = new TreeNode(80);
		tree.ROOT.leftChild.leftChild.leftChild = node;
		
		node = new TreeNode(90);
		tree.ROOT.leftChild.leftChild.rightChild = node;
		
		node = new TreeNode(100);
		tree.ROOT.leftChild.rightChild.leftChild = node;
		
		/*node = new TreeNode(24);
		tree.ROOT.leftChild.rightChild.rightChild = node;
		
		node = new TreeNode(31);
		tree.ROOT.rightChild.leftChild.leftChild = node;
		
		node = new TreeNode(44);
		tree.ROOT.rightChild.leftChild.rightChild = node;
		
		node = new TreeNode(66);
		tree.ROOT.rightChild.rightChild.leftChild = node;
		
		node = new TreeNode(90);
		tree.ROOT.rightChild.rightChild.rightChild = node;
		*/
		countLeafNodes(tree.ROOT);
		System.out.println("Number of leaf nodes: "+count);
		
	}
	public static int count=0;
	public static void countLeafNodes(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		if(node.leftChild == null && node.rightChild == null)
		{
			count++;
		}
		countLeafNodes(node.leftChild);
		countLeafNodes(node.rightChild);
	}
	
}