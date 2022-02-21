package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Fibonacci serisinin uzunluðunu giriniz: ");
		int length=input.nextInt();
		int number1=0, number2=1, total=0;
		
		System.out.print(number1+" " +number2+ " ");
		
		for(int i=1; i<length;i++) {
			
			total=number1+number2;	
			number1=number2;
			number2=total;
			System.out.print(total+ " ");
		}

	}

}
