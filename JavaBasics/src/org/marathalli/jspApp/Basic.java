package org.marathalli.jspApp;

public class Basic 
{
  public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
				if(i%2!=0)
				{
					int num=((i-1)*5)+1;
					for(int j=1;j<=5;j++)
					{
						System.out.print(num+"\t");num++;
					}
				}
				else {
					int num=i*5;
					for(int j=1;j<=5;j++)
					{
						System.out.print(num+"\t");
						num--;
					}
			}
			System.out.println();
		}

	}
}



//1	2	3	4	5	
//10	9	8	7	6	
//11	12	13	14	15	
//20	19	18	17	16	
//21	22	23	24	25	
