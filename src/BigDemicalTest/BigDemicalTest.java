package BigDemicalTest;

import java.math.BigDecimal;

public class BigDemicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0.05+0.01);
		System.out.println(add(0.05, 0.01));
	}

	private static double add(double d, double e) {
		// TODO Auto-generated method stub
		BigDecimal b1 = new BigDecimal(Double.toString(d));
		BigDecimal b2 = new BigDecimal(Double.toString(e));
		return b1.add(b2).doubleValue();
	}

}
