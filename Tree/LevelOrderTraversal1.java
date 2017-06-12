//Breadth first Traversal(Level Order Traversal Method-1)

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
public class LevelOrderTraversal1
{
	TreeNode ROOT;
	public LevelOrderTraversal1()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		LevelOrderTraversal1 tree = new LevelOrderTraversal1();
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
		
		System.out.print("Level Order Traversal:\t");
		printLevelTraversal(tree.ROOT);
	}
	public static int height(TreeNode root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.leftChild);
            int rheight = height(root.rightChild);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
	public static void printLevelTraversal(TreeNode root)
	{
		System.out.println("Height: "+height(root));
		for(int i=1;i<=height(root);i++)
		{
			printGivenLevel(root,i);
		}
	}
	public static void printGivenLevel(TreeNode root, int level)
	{
		if(root == null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(root.data+"\t");
		}
		else if(level>1)
		{
			printGivenLevel(root.leftChild, level-1);
			printGivenLevel(root.rightChild, level-1);
		}
	}
	
}