//Simple tree creation
/*			1
		   / \
		  2	  3
		 /
		4
*/
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
public class TwoTreesAreIdentical
{
	TreeNode ROOT;
	public TwoTreesAreIdentical()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		TwoTreesAreIdentical tree1 = new TwoTreesAreIdentical();
		TreeNode node = new TreeNode(1);
		tree1.ROOT = node;
		
		node = new TreeNode(2);
		tree1.ROOT.leftChild = node;
		
		node = new TreeNode(3);
		tree1.ROOT.rightChild = node;
		
		node = new TreeNode(4);
		tree1.ROOT.leftChild.leftChild = node;
		
		
		TwoTreesAreIdentical tree2 = new TwoTreesAreIdentical();
	    node = new TreeNode(1);
		tree2.ROOT = node;
		
		node = new TreeNode(2);
		tree2.ROOT.leftChild = node;
		
		node = new TreeNode(3);
		tree2.ROOT.rightChild = node;
		
		node = new TreeNode(4);
		tree2.ROOT.leftChild.leftChild = node;
		
		node = new TreeNode(5);
		tree2.ROOT.leftChild.leftChild.leftChild = node;
		
		Boolean result = identicalTrees(tree1.ROOT, tree2.ROOT);
		System.out.println(result);
	}
	
	public static Boolean identicalTrees(TreeNode tree1, TreeNode tree2)
	{
		if(tree1 == null && tree2 == null)
		{
			return true;
		}
		else if(tree1!=null && tree2!=null)
		{
			return ((tree1.data == tree2.data) && identicalTrees(tree1.leftChild, tree2.leftChild) && identicalTrees(tree1.rightChild, tree2.rightChild));
		}
		else 
		{
			return false;
		}
	}
	
}