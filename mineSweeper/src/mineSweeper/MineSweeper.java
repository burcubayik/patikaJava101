package mineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int row;
	int column;
	String[][] mine= new String[row][column];
	String[][] map= new String[row][column];
	int totalMine;
	int userRow;
	int userCol;
	String full="*";
	String empty="-";
	public MineSweeper(int row, int column) {
		
		this.row = row;
		this.column = column;
		this.mine=new String[row][column];
		this.map=new String[row][column];
		this.totalMine=(this.row*this.column)/4;
		this.userRow=0;
		this.userCol=0;
	
	}
	
	public void createMineSweeper() {
		
		for(int i=0; i<mine.length;i++) {
			for(int j=0; j<mine[i].length;j++) {
				mine[i][j]=empty;
				map[i][j]=empty;
			
			}
		}
		randomNumber();
		printMineSweeper(map);
		printMineSweeper(mine);
	}
	public void printMineSweeper(String[][] mineSweeper) {
		for(int i=0; i<row;i++) {
			for(int j=0; j<column;j++) {
				System.out.print(mineSweeper[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void randomNumber() {
		Random random=new Random();
		for(int i=0; i<totalMine;i++) {
		int randomRow= random.nextInt(row-1);
		int randomCol= random.nextInt(column-1);
		mine[randomRow][randomCol]= full;
		}
		
	}
	public int checkMines( int userRow, int userCol) {
		int minUserRow=userRow-1;
		int maxUserRow=userRow+1;
		int minUserCol= userCol-1;
		int maxUserCol=userCol+1;
		int counter=0;
		if(userRow==0)
		{
			minUserRow=0;
		}
		if(userRow==this.row-1) {
			maxUserRow=this.row-1;
		}
		
		if(userCol==0) {
			minUserCol=0;
		}
		if(userCol==this.column-1) {
			maxUserCol=this.column-1;
		}
		for(int i=minUserRow;i<=maxUserRow;i++) {
			for(int j=minUserCol;j<=maxUserCol;j++) {
				if(mine[i][j].equals(full)) {
					counter++;
				}
			}
		}
		return counter;
		}
	public boolean isMined(int userRow, int userCol) {
		this.userRow=userRow;
		this.userCol=userCol;
		if(mine[this.userRow][this.userCol].contains(full)) {
			return true;
		}
		return false;
	}
	public void run() {
		Scanner input=new Scanner(System.in);
		
		int cellMineAmount=0;
		createMineSweeper();
		
		do {
		System.out.print("Satýr giriniz: ");
		this.userRow=input.nextInt();
		System.out.print("Sütun giriniz: ");
		this.userCol=input.nextInt();
		if(userRow<0||userRow>this.row-1 ||userCol<0||userCol>this.column-1) {
			System.out.println("YANLIÞ DEÐER GÝRDÝNÝZ! LÜTFEN MAYIN TARLASI SINIRLARININ ÝÇERÝSÝNDE BÝR DEÐER GÝRÝNÝZ! ");
			continue;
		}
		if(isMined(this.userRow,this.userCol)) {
			System.out.println("KAYBETTÝNÝZ!");
			printMineSweeper(mine);
			break;
		}
		cellMineAmount=checkMines(this.userRow,this.userCol);
		
		map[this.userRow][this.userCol]=String.valueOf(cellMineAmount);
		printMineSweeper(map);
		if(isWin()) {
			System.out.println("TEBRÝKLER KAZANDINIZ!");
			break;
		}
		}while(true) ;
			
		
	}
	
	
	
	public boolean isWin() {
		int emptyAmount=(this.row*this.column)-this.totalMine;
		int counter=0;
		for(int i=0;i<mine.length;i++) {
			for(int j=0;j<mine[i].length;j++)
			if(!mine[i][j].equals(full)&& !mine[i][j].equals(empty)) {
				counter++;
			}
				
		}
		if(emptyAmount==counter) {
		return true;
		}
		return false;
	}

}
