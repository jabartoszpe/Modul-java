
public class Main9 {

    public static void main(String[] args) {
        int n = 5;
        int rowCounter = 1;

        for(int i=0; i<n; i++) {
            String row = "";
            int colCounter = 1;
            for(int j=0; j<n; j++) {
                if(colCounter<=rowCounter) {
                    row += "* ";
                    colCounter++;
                } else {
                    String colString = String.valueOf(colCounter)+" ";
                    row += colString;
                    colCounter++;
                }
            }
            System.out.println(row);
            rowCounter++;
        }
    }

}
