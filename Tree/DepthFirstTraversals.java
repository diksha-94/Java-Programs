//Depth First Traversals(Inorder, Preorder, Postorder)
/*			1
		   / \
		  2	  3
		 / \
		4   5
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
public class DepthFirstTraversals
{
	TreeNode ROOT;
	public DepthFirstTraversals()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		DepthFirstTraversals tree = new DepthFirstTraversals();
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
		System.out.print("Inorder:\t");
		inOrder(tree.ROOT);
		
		System.out.print("Preorder:\t");
		preOrder(tree.ROOT);
		
		System.out.print("Postorder:\t");
		postOrder(tree.ROOT);
	}
	public static void inOrder(TreeNode root)
	{
		if(root==null)
		{
			//System.out.println("Tree is empty");
			return;
		}
		inOrder(root.leftChild);
		System.out.print(root.data+"\t");
		inOrder(root.rightChild);
	}
	public static void preOrder(TreeNode root)
	{
		if(root==null)
		{
			//System.out.println("Tree is empty");
			return;
		}
		System.out.print(root.data+"\t");
		preOrder(root.leftChild);
		preOrder(root.rightChild);
	}
	public static void postOrder(TreeNode root)
	{
		if(root==null)
		{
			//System.out.println("Tree is empty");
			return;
		}
		postOrder(root.leftChild);
		postOrder(root.rightChild);
		System.out.print(root.data+"\t");
	}
	
}