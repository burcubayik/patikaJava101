package ebobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Ýlk sayýyý giriniz: ");
		int n1=input.nextInt();
		
		System.out.print("Ýkinci sayýyý giriniz: ");
		int n2=input.nextInt();
		int ebob=0, ekok=0;
		
		if(n1<n2) {
			int i=n1;
			while( i >= 1) {
				if(n1 % i == 0 && n2 % i== 0) {
					ebob=i;
					break;
				}
				i--;
			}
			int k=1;
			while( k <= (n1*n2)) {
				if(k % n1 == 0 && k % n2 == 0) {
					ekok=k;
					break;
				}
				k++;
			}
		}
		else {
			int i=n2;
			while( i >= 1) {
				if(n1 % i == 0 && n2 % i== 0) {
					ebob=i;
					break;
				}
				i--;
			}
			int k=1;
			while( k <= (n1*n2)) {
				if(k % n1 == 0 && k % n2 == 0) {
					ekok=k;
					break;
				}
				k++;
			}
		}
		System.out.println("EBOB: "+ ebob);
		System.out.println("EKOK. "+ekok);
		

	}

}

