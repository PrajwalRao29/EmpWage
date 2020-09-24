package empwage;
public class employee {
public static void main (String args[])
{
int wage=0;
double randomValue=Math.floor(Math.random()*10 % 2);
if(randomValue==1)
{
	wage=20*8;
}
System.out.println(wage);
}
}