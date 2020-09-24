package empwage;
public class employee {
public static void main (String args[])
{
int wage=0;
double randomValue=Math.floor(Math.random()*10 % 3);
if(randomValue==1)
{
	wage=20*8;
}
if(randomValue==2)
{
	wage=20*4;
}
System.out.println(wage);
}
}