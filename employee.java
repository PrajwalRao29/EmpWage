package empwage;
class employee 
{
	public static void main(String args[])
	{
		SampleEmp e=new SampleEmp();
	}
}
class SampleEmp
{
	int wage=0;
	int hours=0;
	int days=0;
	{
	while(days<21 || hours<101)
	{
		int randomValue=(int)Math.floor(Math.random()*10 % 3);
		switch(randomValue)
		{
		case 1:wage=wage+20*8;
		hours=hours+8;
		days=days+1;
		break;
		case 2:wage=wage+20*4;
		hours=hours+4;
		days=days+1;
		break;
		default: wage=wage+0;
		}
	}
	System.out.println("Wage per month = "+wage);
	}
}