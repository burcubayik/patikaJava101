package arrays;

import java.util.Arrays;

public class NumberFrequency {
	static boolean isFind(int[] arr,int value) {
		for(int i: arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list= {10, 20, 20, 10, 10, 20, 5, 20};
		int[] checkList=new int[list.length];
		int counter=0,startIndex=0;
		
		System.out.println("Dizi: "+Arrays.toString(list));
		System.out.println("Tekrar sayýlarý");
		for(int i=0;i<list.length;i++) {
			
			for(int j=0;j<list.length;j++) {
				
				if(list[i]==list[j]) {
					counter++;					
				}
			}
			if(!isFind(checkList,list[i])) {
				checkList[startIndex++]=list[i];
				System.out.println(list[i]+" sayýsý "+counter+ " kere tekrar etmiþtir.");
			}
			counter=0;
		

		}

	}
	}
