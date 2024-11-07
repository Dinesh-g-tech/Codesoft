package codesoft;

import java.util.Scanner;

public class Studentgrade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the rollno");
		String roll = sc.nextLine();
		System.out.println("enter hindi marks");
		int hindi = sc.nextInt();
		System.out.println("enter english marks");
		int eng = sc.nextInt();
		System.out.println("enter maths marks");
		int maths = sc.nextInt();
		System.out.println("enter phisics marks");
		int phy = sc.nextInt();
		System.out.println("enter chemistry marks");
		int che = sc.nextInt();
		
		
		
		
		int total = hindi + eng + maths + phy + che ;
		
		int persent = total/5;
		
		
		
		System.out.println(" Final results  ");
		
		System.out.println("name is " +name);
		System.out.println("roll is " +roll);
		System.out.println("marks " +"\n hindi =  " + hindi  +"\n eng = " +eng +"\n maths =" +maths +"\n phy = " +maths +"\n che = " +che);
		
		System.out.println(" total number  is = " +total);
		System.out.println("persents is = " +persent);
		
		
		
		if(persent <= 100 && persent >= 85)
		{
			System.out.println(" pass with grade A+" );
		}
		else if(persent < 85 && persent >= 75)
		{
			System.out.println("pass with grade A" );
		}
		
		else if(persent < 75 && persent >= 60)
		{
			System.out.println(" pass with grade B " );
		}
		else if(persent <60 && persent >=45)
		{
			System.out.println(" pass with grade C" );
		}
		else if(persent <45 && persent >=33)
		{
			System.out.println("pass with grade D" );
		}
		
		else {
			System.out.println("fail");
		}
		

		
		
		
	}

}
