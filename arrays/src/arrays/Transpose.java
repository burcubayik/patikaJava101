package arrays;

import java.util.Arrays;

public class Transpose {
	public static void transpose(int[][] matris) {
		int[][] matrisTranspose= new int[matris[0].length][matris.length];
		for(int i=0; i<matris.length;i++) {
			for(int j=0; j<matris[i].length;j++) {
				matrisTranspose[j][i]= matris[i][j];
			}
			
		}
		System.out.println(Arrays.deepToString(matrisTranspose));
	}

	public static void main(String[] args) {
		int[][] matris= {{1,2,3},{4,5,6}};
		transpose(matris);

	}

}
