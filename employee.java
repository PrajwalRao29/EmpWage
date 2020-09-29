package empwage;

import java.util.ArrayList;
import java.util.Scanner;

class employee 
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of companies details to be added");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		ArrayList <SampleEmp> arr=new ArrayList<SampleEmp>();
		boolean j=true;
		for(int i=0;i<y;i++)
		{
			System.out.println("Enter the name of the company");
			String n=sc.next();
			System.out.println("Enter the daily wage of the employee");
			int w=sc.nextInt();
			System.out.println("Enter the number of working days of the employee");
			int d=sc.nextInt();
			System.out.println("Enter the number of working hours of the employee");
			int h=sc.nextInt();
			SampleEmp e=new SampleEmp(n,w,d,h);
			e.Calculate();
			arr.add(e);
		}
		while(j)
		{
			System.out.println("Do you want to access company details(Y/N)");
			String acc=sc.next();
			if(acc.equalsIgnoreCase("N"))
			{
				j=false;
				break;
			}
			else
			{
				System.out.println("Enter company name to access its details");
				String s=sc.next();
				checkDetails(arr,s);
			}
		}
	}
		public static void checkDetails(ArrayList <SampleEmp> arr,String s)
		{
			int key=0;
			for(int i=0;i<arr.size();i++)
			{
				if(arr.get(i).name.equalsIgnoreCase(s))
				{
					System.out.println("TOTAL WAGE="+arr.get(i).wage);
					key=1;
					break;
				}
			}
			if(key==0)
			{
				System.out.println("Company details not found");		
			}
		}
	}
class SampleEmp implements Calculation
{
	String name;
	int wage;
	int w=0;
	int h=0;
	int d=0;

	public SampleEmp(String name,int w,int d,int h)
	{
		this.w=w;
		this.h=h;
		this.d=d;
		this.name=name;
	}
	public void Calculate()
	{
		int wage=0;
		int hours=0;
		int days=0;
		{
			while(days<=d || hours<=h)
			{
				int randomValue=(int)Math.floor(Math.random()*10 % 3);
				switch(randomValue)
				{
				case 1:wage=wage+w*8;
				hours=hours+8;
				days=days+1;
				break;
				case 2:wage=wage+w*4;
				hours=hours+4;
				days=days+1;
				break;
				default: wage=wage+0;
				}
			}
			this.wage=wage;
			System.out.println("Daily Wage="+w);
			System.out.println("Wage per month = "+wage);
		}
	}
}
interface Calculation
{
	void Calculate();
}

