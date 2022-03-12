package arrays;

import java.util.Arrays;

public class FindDuplicate {
	static boolean isFind(int[] arr,int value) {
		for(int i: arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list= {3,7,3,3,2,9,6,1,9,1,2};
		int[] duplicate= new int[list.length];
		int startIndex=0;
		for(int i=0; i<list.length;i++) {
			for(int j=0; j<list.length;j++) {
				if(list[i]==list[j]&& i!=j) {
					if(!isFind(duplicate,list[i]) && list[i]%2==0) {
					duplicate[startIndex++]=list[i];
					}
					break;
				}
			}
		}
		for(int value:duplicate) {
			if(value!=0) {
				System.out.println(value);
			}
		}
		
	}

}
