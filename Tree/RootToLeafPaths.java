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
public class RootToLeafPaths
{
	TreeNode ROOT;
	public RootToLeafPaths()
	{
		ROOT = null;
	}
	public static void main(String[] args)
	{
		RootToLeafPaths tree = new RootToLeafPaths();
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
		
		allRootToLeafPaths(tree.ROOT);
		/*for(List<Integer> llst : list)
		{
			for(Integer item : llst)
			{
				System.out.print(item+"\t");
			}
			System.out.println();
		}*/
	}
	public static List<List<Integer>> list = new ArrayList<List<Integer>>();
	public static List<Integer> dummyList = new ArrayList<Integer>();
	
	public static void allRootToLeafPaths(TreeNode node)
	{
		if(node == null)
		{
			
			//list.add(dummyList);
			//dummyList.remove(dummyList.size()-1);
			//dummyList = new ArrayList<Integer>();
			return;
		}
		dummyList.add(node.data);
		if(node.leftChild==null && node.rightChild==null)
		{
			for(Integer item : dummyList)
			{
				System.out.print(item+"\t");
			}
			System.out.println();
		}
		else
		{
			dummyList.add(node.data);
			allRootToLeafPaths(node.leftChild);
			allRootToLeafPaths(node.rightChild);
		}
	}
	
}