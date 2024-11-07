package codesoft;

import java.util.Scanner;

public class Quizzgame {

	public static void main(String[] args) throws InterruptedException {
		
	Thread t1 = new Thread();
	Scanner sc = new Scanner(System.in);
	
	t1.sleep(2000);
	String[] Q = { "what is prime minister of india ? " , "what is president of india" , "what is ceo of tesla " , "what is name of national bird?  " ,"what i CM of m.p? , "};
	String[] a = {"narendra modi" , "murmu" , "musk" , "peacock" ,"mohan ji"};
	
	int score = 0;
	
	for(int i=0;i<Q.length;i++)
	{
		System.out.println("Q " +(i + 1) +"  " +Q[i]);
		System.out.println("enter the anser ");
		String ua = sc.nextLine();
		
		
		if(ua.equalsIgnoreCase(a[i])) {
			
			System.out.println("correct anser");
			score++;
			
			t1.sleep(2000);
			
	}
		else {
			System.out.println("wrong anser " +a[i]);
		}
	}
	System.out.println("game over " +" your score is " +score +"/" +Q.length);
}
}
