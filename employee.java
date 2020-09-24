package empwage;
public class employee {
public static void main (String args[])
{
double randomValue=Math.floor(Math.random()*10%2);
System.out.println("randomValue: "+randomValue);
String message = (randomValue==1.0)?"Employee present":"Employee absent";
System.out.println(message);
}
}