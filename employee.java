package empwage;
public class employee {
public static void main (String args[])
{
int wage=0;
int randomValue=(int)Math.floor(Math.random()*10 % 3);
switch(randomValue)
{
case 1:wage=20*8;
break;
case 2:wage=20*4;
break;
default: wage=0;
}
System.out.println(wage);
}
}