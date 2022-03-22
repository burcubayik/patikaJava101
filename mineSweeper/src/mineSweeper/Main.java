package mineSweeper;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Mayýn Tarlasý oyununa hoþ geldiniz! ");
		System.out.print("Oluþturmak istediðiniz mayýn tarlasýnýn boyutlarýný giriniz: ");
		System.out.println("Satýr: ");
		int row=input.nextInt();
		System.out.println("Sütun: ");
		int column=input.nextInt();
		MineSweeper mineSweeper= new MineSweeper(row,column);
		mineSweeper.run();
		

	}

}
