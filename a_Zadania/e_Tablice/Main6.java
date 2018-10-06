
public class Main6 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i-2;
		}
		int max = Integer.MIN_VALUE;
		for(int i=numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
	}

}
