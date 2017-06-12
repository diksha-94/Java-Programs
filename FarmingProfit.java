import java.util.*;
public class FarmingProfit
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] splitStr = str.split(",");
		farmingProfit(Double.parseDouble(splitStr[0]),Double.parseDouble(splitStr[1]),Double.parseDouble(splitStr[2]),Double.parseDouble(splitStr[3]),Double.parseDouble(splitStr[4]),Double.parseDouble(splitStr[5]),Double.parseDouble(splitStr[6]),Double.parseDouble(splitStr[7]),Double.parseDouble(splitStr[8]));
	}
	public static void farmingProfit(Double l, Double f, Double p, Double f1, Double p1, Double f2, Double p2, Double s1, Double s2)
	{
		double profit = 0.00;
		Double s = (s1>s2)?s1:s2;
		Double fert1 = f/f1;
		Double pest1 = p/p1;
		Double fert2 = f/f2;
		Double pest2 = p/p2;
		double wheat = (fert1>pest1)?pest1:fert1;
		double rice = (fert2>pest2)?pest2:fert2;
		double wheatCost = wheat*s1;
		double riceCost = rice*s2;
		double cost=0.00;
		String output="";
		
		if(wheatCost>riceCost)
		{
			cost=wheatCost;
			rice=0.00;
			output+=cost+" "+wheat+" "+rice;
		}
		else if(riceCost>wheatCost)
		{
			cost=riceCost;
			wheat=0.00;
			output+=cost+" "+wheat+" "+rice;
		}
		else
		{
			output+="-1";
		}
		//double cost = (wheatCost>riceCost)?wheatCost:riceCost;
		System.out.print(output);
	}
	static double totalProfit = 0.00;
	public static String recursiveFarmingProfit(Double l, Double f, Double p, Double f1, Double p1, Double f2, Double p2, Double s1, Double s2)
	{
		//double profit = 0.00;
		Double s = (s1>s2)?s1:s2;
		Double fert1 = f/f1;
		Double pest1 = p/p1;
		Double fert2 = f/f2;
		Double pest2 = p/p2;
		if(s==s1 && fert1<=fert2 && pest1<=pest2 && fert1!=0 && pest1!=0)
		{
			totalProfit+=s1;
			recursiveFarmingProfit(l-1.00, f-fert1, p-pest1, f1, p1, f2, p2, s1, s2);
		}
		else if(s==s2 && fert1>=fert2 && pest1>=pest2 && fert2!=0 && pest2!=0)
		{
			totalProfit+=s2;
			recursiveFarmingProfit(l-1.00, f-fert2, p-pest2, f1, p1, f2, p2, s1, s2);
		}
	}
}