
public class Main4 {

	public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = i+2;
        }
        int sumOdd = 0;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]%2==0) {
                System.out.println(numbers[i] + " - liczba parzysta");
            } else {
                sumOdd +=numbers[i];
            }
        }
        System.out.println("Suma liczb nieparzystych to: " + sumOdd +".");
    }

}
