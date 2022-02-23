package exponentCalculationWithRecursiveMethod;

import java.util.Scanner;

public class Main {
	static int power() {
		int base;
		int exp;
		int result=1; 
		Scanner input=new Scanner(System.in);
		System.out.print("Taban deðeri giriniz :");
		base=input.nextInt();
		System.out.print("Üs deðerini giriniz :");
		exp=input.nextInt();
		for(int i=1; i<= exp;i++) {
			result*=base;
		}
		System.out.println("Sonuç: "+result);
		power();
		return result;
		
		
	}

	public static void main(String[] args) {
		power();
		

	}

}
