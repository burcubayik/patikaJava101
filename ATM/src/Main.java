import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userName, password;
		int right=3, select, balance=1500, price;
	
		
		while(right>0) {
			System.out.print("Kullanýcý adýnýz: ");
			userName=input.nextLine();
			
			System.out.print("Þifreniz: ");
			password=input.nextLine();
			
			if(userName.equals("patika")&& password.equals("java101")) {
				System.out.println("Giriþ Baþarýlý \nHoþgeldiniz.");
				do {
				System.out.println("1-Para yatýrma"
						+ "\n2-Para çekme "
						+ "\n3-Bakiye Sorgulama "
						+ "\n4-Çýkýþ");
				System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz: ");
				select=input.nextInt();
				switch(select) {
					case 1:
						System.out.print("Yatýrmak istediðiniz tutar: ");
						price=input.nextInt();
						balance+=price;
						break;
					case 2:
						System.out.print("Çekmek istediðiniz tutar: ");
						price=input.nextInt();
						
						if(balance>=price)balance-=price;
						else System.out.println("Bakiyeniz yetersiz.");
						
						break;
					case 3:
						System.out.println("Bakiyeniz:  "+ balance);
						
						break;
				}
			
				}while(select!=4);
				System.out.println("Bizi tercih ettiðiniz için teþekkür ederiz.");
				break;
			}
			else {
				
				right--;
				if(right==0) {
					System.out.println("Hesabýnýz bloke oldu. Banka ile iletiþime geçiniz.");
			}
				else System.out.println("Hatalý giriþ yaptýnýz lütfen tekrar deneyiniz. \nKalan Hak: "+ right);
				
			}
				
			
		}

	}

}
