package com.db1.db1start;

public class Matematica {
	
	public static double MenorDosTres(){
		
		double n1 = 10.88;
        double n2 = 4.66;
        double n3 = 15.322;
        
        if (n1 < n3 && n1 < n2) {
            System.out.println(n1 + " é menor que "+ n2 +", "+ n3);
	       }
        if (n2 < n3 && n2 < n1) {
            System.out.println(n2 + " é menor que "+ n1 +", "+ n3);
        }
        
        if (n3 < n2 && n3 < n1) {
            System.out.println(n3 + " é menor que "+ n1 +", "+ n2);
        }
		return (double) (0);
        
	}
	
	public static double Dois(){
		
		double a = 11.775;
		double b = 20.355;
		
		System.out.println("O menor numero é "+ Math.min(a,b));
		
		return 0;
		
	}

	
	
}
