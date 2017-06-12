class ConvertToRoman
{
    static void convertToRoman(int n)
    {
			int num;
			int cond=0;
			while(n!=0)
			{
				//num=n/1000;
				if((num=n/1000)>0)
				{
					cond=1000;
					n=n%1000;
				}
				else if(n>=900)
				{
					num=1;
					cond=900;
					n=n-900;
				}
				else if((num=n/500)>0)
				{
					cond=500;
					n=n%500;
				}
				else if(n>=400)
				{
					num=1;
					cond=400;
					n=n-400;
				}
				else if((num=n/100)>0)
				{
					cond=100;
					n=n%100;
				}
				else if(n>=90)
				{
					num=1;
					cond=90;
					n=n-90;
				}
				else if((num=n/50)>0)
				{
					cond=50;
					n=n%50;
				}
				else if(n>=40)
				{
					num=1;
					cond=40;
					n=n-40;
				}
				else if((num=n/10)>0)
				{
					cond=10;
					n=n%10;
				}
				else if(n==9)
				{
					cond=9;
					n=0;
				}
				else if((num=n/5)>0)
				{
					cond=5;
					n=n%5;
				}
				else if(n==4)
				{
					cond=4;
					n=0;
				}
				else if((num=n/1)>0)
				{
					cond=1;
					n=n%1;
				}
				switch(cond)
				{
					case 1000:
						for(int i=0;i<num;i++)
						{
							System.out.println("M");
						}
						break;
					case 900:
						System.out.println("CM");
						break;
					case 500:
						for(int i=0;i<num;i++)
						{
							System.out.println("D");
						}
						break;
					case 400:
						System.out.println("CD");
						break;
					case 100:
						for(int i=0;i<num;i++)
						{
							System.out.println("C");
						}
						break;
					case 90:
						System.out.println("XC");
						break;
					case 50:
						for(int i=0;i<num;i++)
						{
							System.out.println("L");
						}
						break;
					case 40:
						System.out.println("XL");
						break;
					case 9:
						System.out.println("IX");
						break;
					case 10:
						for(int i=0;i<num;i++)
						{
							System.out.println("X");
						}
						break;
					case 5:
						for(int i=0;i<num;i++)
						{
							System.out.println("V");
						}
						break;
					case 4:
						System.out.println("IV");
						break;
					case 1:
						for(int i=0;i<num;i++)
						{
							System.out.println("I");
						}
				}
			}
    }
	public static void main(String args[])
	{
		convertToRoman(4999);
	}
}