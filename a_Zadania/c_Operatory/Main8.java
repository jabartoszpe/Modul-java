
public class Main8 {

	public static void main(String[] args) {
		int black = 16, white = 15;
		boolean BlackOrWhite;
		BlackOrWhite = black < white;
		boolean good = true, bad = false;
		boolean GoodOrBad;
		GoodOrBad = good || bad;
		boolean comparison = good && bad;
		System.out.println(BlackOrWhite);
		System.out.println(GoodOrBad);
		System.out.println(comparison);
	}

}
// wynik związany jest z tzw. tabelą wartości logicznych