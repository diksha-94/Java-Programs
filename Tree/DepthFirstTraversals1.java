//Depth First Traversals(Inorder, Preorder, Postorder)

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
public class DepthFirstTraversals1
{
	TreeNode ROOT;
	public DepthFirstTraversals1()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		DepthFirstTraversals1 tree = new DepthFirstTraversals1();
		TreeNode node = new TreeNode(25);
		tree.ROOT = node;
		
		node = new TreeNode(15);
		tree.ROOT.leftChild = node;
		
		node = new TreeNode(50);
		tree.ROOT.rightChild = node;
		
		node = new TreeNode(10);
		tree.ROOT.leftChild.leftChild = node;
		
		node = new TreeNode(22);
		tree.ROOT.leftChild.rightChild = node;
		
		node = new TreeNode(35);
		tree.ROOT.rightChild.leftChild = node;
		
		node = new TreeNode(70);
		tree.ROOT.rightChild.rightChild = node;
		
		node = new TreeNode(4);
		tree.ROOT.leftChild.leftChild.leftChild = node;
		
		node = new TreeNode(12);
		tree.ROOT.leftChild.leftChild.rightChild = node;
		
		node = new TreeNode(18);
		tree.ROOT.leftChild.rightChild.leftChild = node;
		
		node = new TreeNode(24);
		tree.ROOT.leftChild.rightChild.rightChild = node;
		
		node = new TreeNode(31);
		tree.ROOT.rightChild.leftChild.leftChild = node;
		
		node = new TreeNode(44);
		tree.ROOT.rightChild.leftChild.rightChild = node;
		
		node = new TreeNode(66);
		tree.ROOT.rightChild.rightChild.leftChild = node;
		
		node = new TreeNode(90);
		tree.ROOT.rightChild.rightChild.rightChild = node;
		
		System.out.print("Inorder:\t");
		inOrder(tree.ROOT);
		System.out.println();
		
		System.out.print("Preorder:\t");
		preOrder(tree.ROOT);
		System.out.println();
		
		System.out.print("Postorder:\t");
		postOrder(tree.ROOT);
		System.out.println();
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