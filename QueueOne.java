import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class QueueOne {
	static int rear=-1;
	static int front=-1;
	static List<Integer> array = new ArrayList<Integer>();
    public static void main(String args[] ) throws Exception {
        
         
        int N = Integer.parseInt(line[0]);
		int X = Integer.parseInt(line[1]);
		int[] queue = new int[N];
		int num=-1;
		String[] values = (br.readLine()).split(" ");
		front=0;
		rear=N-1;
		for(int i=0;i<N;i++)
		{
			queue[i] = Integer.parseInt(values[i]);
		}
		for(int i=0;i<X;i++)
		{
			if((rear-front+1)<X)
			{
				num=rear-front+1;
			}
			else
			{
				num=X;
			}
			for(int j=0;j<num;j++)
			{
				dequeue();
			}
			int inf = INTEGER.POSITIVE_INFINITY*-1;
			int max = inf.intValue();
			for(int elem : array)
			{
				if(elem>max)
				{
					max=elem;
				}
			}
		}
	}
	public static void enqueue(int[] queue, int item)
	{
		queue[++rear] = item;
	}
	public static void dequeue()
	{
		array.add(queue[front]);
		front++;
	}
}