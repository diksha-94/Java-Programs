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
public class TreeImplementation
{
	TreeNode ROOT;
	public TreeImplementation()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		TreeImplementation tree = new TreeImplementation();
		TreeNode node = new TreeNode(1);
		tree.ROOT = node;
		
		node = new TreeNode(2);
		tree.ROOT.leftChild = node;
		
		node = new TreeNode(3);
		tree.ROOT.rightChild = node;
		
		node = new TreeNode(4);
		tree.ROOT.leftChild.leftChild = node;
	}
	
}