package Coding;

public class Bank 
{
	int i = 12;
}
	class UrbanBank extends Bank
	{
		
	}
	
	class RuralBank extends Bank
	{
		
	}
	
	class HDFC extends UrbanBank
	{
		public void Test1()
		{
			System.out.println(i);
		}
	}
	
	class SBI extends UrbanBank
	{
		
	}
	
	class JSKB extends RuralBank
	{
		
	}
