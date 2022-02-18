package perfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int total=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		int number=input.nextInt();
		
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		if(number==total) System.out.println(number+ " sayýsý mükemmmel sayýdýr.");
		
		else System.out.println(number+ " sayýsý mükemmmel sayý deðildir."); 
	}

}
