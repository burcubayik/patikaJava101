package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Dizinin boyutunu giriniz: ");
		int arrayLength=input.nextInt();
		int[] list=new int[arrayLength];
		System.out.println("Dizinin elemanlarý: ");
		for(int i=0; i<list.length;i++) {
			System.out.print((i+1)+". eleman: ");
			list[i]=input.nextInt();
			
		}
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));

	}

}
