package invertedTriangleWithStars;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Basamak sayýsýný girin: ");
		int digitNumber=input.nextInt();
		
		for(int i=digitNumber; i>=1; i--) {
			for(int l=1; l<=digitNumber-i;l++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
