package advancedCalculator;

import java.util.Scanner;

public class Main {
	static void plus() {
		Scanner input=new Scanner(System.in);
		int number, result = 0, i = 1;
		System.out.println("Sonucu görmek istediðinizde sayý deðerine 0 girin!");
        while (true) {
            System.out.print(i++ + ". sayý :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
	}
	static void  minus() {
		Scanner input=new Scanner(System.in);
		System.out.println("Sonucu görmek istediðinizde sayý deðerine 0 girin!");
		System.out.print("1. Sayý: ");
		int number=input.nextInt();
		int i=2, result=number;
		while(true) {
			System.out.print(i++ +". Sayý: ");
			number=input.nextInt();
			if(number==0) {
				break;
			}
			
			result-=number;
			
		}
		System.out.println("Sonuç : " + result);
		
	}
	static void times() {
		Scanner input=new Scanner(System.in);
		int number, result = 1, i = 1;
		System.out.println("Sonucu görmek istediðinizde sayý deðerine 1 girin! ");
		while(true) {
			System.out.print(i++ +". Sayý: ");
			number=input.nextInt();
			if(number==1) {
				break;
			}
			if(number==0) {
				result=0;
				break;
			}
			result*=number;
		}
		System.out.println("Sonuç : " +result);
	}
	static void divided() {
		Scanner input=new Scanner(System.in);
		System.out.println("Sonucu görmek istediðinizde sayý deðerine 1 girin! ");
		System.out.print("1. Sayý");
		double number=input.nextDouble();
		double result=number;
		int i = 2;
		
		while(true) {
			System.out.print(i++ +". Sayý: ");
			number=input.nextDouble();
			if(number==1) {
				break;
			}
			if(number==0) {
				System.out.println("Bölen 0 olamaz ");
				continue;
			}
			result/=number;
		}
		System.out.println(result);
	}
	static void power() {
		Scanner input=new Scanner(System.in);
		System.out.print("Taban deðerini giriniz: ");
		int base=input.nextInt();
		System.out.print("üs deðerini giriniz: ");
		int exponent=input.nextInt();
		int result=1;
		for(int i=1; i<=exponent;i++) {
			result*=base;
		}
		System.out.println("Sonuç : " +result);
		
	}
	
	static void factorial() {
		Scanner input= new Scanner(System.in);
		System.out.print("Faktöriyeli alýnacak sayýyý girin: ");
		int number=input.nextInt();
		int  result=1;
		for(int i=1; i<=number;i++)
		{
			result*=i;
		}
		System.out.println("Sonuç : " +result);
	}
	static void mode() {
		Scanner input= new Scanner(System.in);
		int result=0;
		System.out.print("Modu alýnacak sayýyý girin: ");
		int number= input.nextInt();
		
		System.out.print("Modu girin: ");
		int mode=input.nextInt();
		result=number%mode;
		System.out.println("Sonuç : " +result);
	}
	static void rectangle() {
		int perimeter=0,area=0;
		
		Scanner input= new Scanner(System.in);
		System.out.print("Uzun kenarý girin: ");
		int longEdge= input.nextInt();
		System.out.print("Kýsa kenarý girin: ");
		int shortEdge= input.nextInt();
		
		perimeter=(2*(longEdge+shortEdge));
		area= longEdge*shortEdge;
		
		System.out.println("Çevre: "+perimeter);
		System.out.println("Alan: "+area); 
		
		
	}

	public static void main(String[] args) {
		int select;
		Scanner input=new Scanner(System.in);
		
		String menu="1- Toplama Ýþlemi\n"
				+ "2- Çýkarma Ýþlemi\n"
				+ "3- Çarpma Ýþlemi\n"
				+ "4- Bölme iþlemi\n"
				+ "5- Üslü Sayý Hesaplama\n"
				+ "6- Faktoriyel Hesaplama\n"
				+ "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabý\n"
				+ "0- Çýkýþ";
		System.out.println(menu);
		do {
			System.out.print("Yapmak istediðiniz iþlemi seçin: ");
			select=input.nextInt();
			
			switch(select) {
				case 1:
					plus();
					break;
				case 2:
					minus();
					break;
				case 3:
					times();
					break;
				case 4:
					divided();
					break;
				case 5:
					power();
					break;
				case 6:
					factorial();
					break;
				case 7:
					mode();
					break;
				case 8:
					rectangle();
					break;
				case 0:
					break;
				
				
			}
			
		}
		while(select!=0);
			
		
		

	}

}
