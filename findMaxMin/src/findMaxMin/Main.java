package findMaxMin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max=0, min=0;
		Scanner input=new Scanner(System.in);
		int n,number;
		System.out.print("Kaç sayý gireceksiniz? ");
		n=input.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.print(i+ ". Sayýyý giriniz: ");
			number=input.nextInt();
			if(i==1) {
				max=number;
				min=number;
			}
	
			if(max<number) max=number;
			if(min>number) min=number;
		}
		 System.out.println("En büyük sayý: "+ max);
		 System.out.println("En küçük sayý: "+min);

	}

}
