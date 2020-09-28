package empwage;

import java.util.Scanner;

class employee 
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of companies details to be added");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=-0;i<a;i++)
		{
		System.out.println("Enter the daily wage of the employee");
		int w=sc.nextInt();
		System.out.println("Enter the number of working days of the employee");
		int d=sc.nextInt();
		System.out.println("Enter the number of working hours of the employee");
		int h=sc.nextInt();
		SampleEmp e=new SampleEmp(w,d,h);
		e.Calculate();
		}
	}
}class SampleEmp
{
	int w=0;
	int h=0;
	int d=0;
	public SampleEmp(int w,int d,int h)
	{
		this.w=w;
		this.h=h;
		this.d=d;
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
	System.out.println("Wage per month = "+wage);
	}
	}
}
