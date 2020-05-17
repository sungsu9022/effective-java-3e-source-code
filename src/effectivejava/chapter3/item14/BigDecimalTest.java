package effectivejava.chapter3.item14;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

import effectivejava.chapter3.item13.PhoneNumber;

public class BigDecimalTest {
	public static void main(String[] args) {
		HashSet<BigDecimal> hashSet = new HashSet();
		TreeSet<BigDecimal> treeSet = new TreeSet<>();

		BigDecimal a = new BigDecimal("1.0");
		BigDecimal b = new BigDecimal("1.00");
		Double c = 1.0;

		hashSet.add(a);
		hashSet.add(b);

		System.out.println(hashSet);


		treeSet.add(a);
		treeSet.add(b);

		System.out.println(treeSet);
	}
}
