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
		}
	}
}
class SampleEmp
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
	void Calculate()
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
			System.out.println("Wage per month for company "+name+" is="+wage);
		}
	}
}
