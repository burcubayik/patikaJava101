package harmonicAverage;

public class Main {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		double harmonicSeries=0,average=0;
		for(int i=0;i<numbers.length;i++) {
			harmonicSeries+=1.0/numbers[i];
		}
		average=numbers.length/harmonicSeries;
		
		System.out.println("Harmonik Ortalama: "+average);

	}

}
