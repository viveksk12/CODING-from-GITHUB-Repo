package Coding;

import java.util.Scanner;

public class VKScannClass 
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		Scanner vkscann = new Scanner(System.in);
		System.out.println("Enter 1st value:");
		int v1 = vkscann.nextInt(5);
		System.out.println("Enter 2st value:");
		int v2 = vkscann.nextInt(2);
		
		int sum=v1+v2;
		//sum=v1+v2;
		System.out.println("Addition -> "+sum);
		
	}
}
