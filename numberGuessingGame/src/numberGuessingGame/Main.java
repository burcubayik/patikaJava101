package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static boolean isWin(int selected, int randomNumber) {
		if(selected==randomNumber) {
			
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Random random=new Random();
		int randomNumber= random.nextInt(100);
		System.out.println(randomNumber);
		int selected,remain;
		boolean isWrong=false;
		for(int i=0;i<5;) {
			System.out.print("Tahmininizi giriniz: ");
			selected=input.nextInt();
			if(selected<0||selected>100) {
				if(isWrong) {
					System.out.println("Çok fazla hatalý giriþ yaptýnýz! Kalan hak: "+(5-(++i)));
				}
				else {
					isWrong=true;
				System.out.println("Lütfen 0 ile 100 arasýnda bir deðer giriniz!");
				}
				continue;
			}
			if(isWin(selected,randomNumber)) {
				System.out.println("Tahmininiz Doðru. Tahmin edilen sayý: "+ selected);
				break;
			}
			else {
				remain=5-(++i);
				if(remain==0) {
					System.out.println("Kaybettiniz! Sayý: "+randomNumber);
				}
				else {
					if(selected<randomNumber) {
						System.out.println("Tahmininiz sayýdan küçüktür!");
					}
					else {
						System.out.println("Tahmininiz sayýdan büyüktür!");
					}
					System.out.println("Yanlýþ Tahmin! Lütfen tekrar deneyiz. Kalan tahmin hakkýnýz: "+remain);
				}
			}
			
		}

	}

}
