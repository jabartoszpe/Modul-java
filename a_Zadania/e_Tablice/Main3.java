
public class Main3 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+2;
		}
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum +=numbers[i];
		}
		System.out.println("Suma elementów tablicy to: " + sum +".");
	}
}
// nie do końca zrozumiałe jest dla mnie rozwiązanie