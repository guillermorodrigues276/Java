import java.text.DecimalFormat;

public class DecimalFormatNumber {
	public static void main(String[] args) {

		double variavel = 3.237;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("" + df.format(variavel));
	}
}