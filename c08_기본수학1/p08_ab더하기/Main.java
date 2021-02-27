package c08_기본수학1.p08_ab더하기;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1, str2;
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.next();
		str2 = scanner.next();
		BigInteger bi1 = new BigInteger(str1);
		BigInteger bi2 = new BigInteger(str2);
		BigInteger bis = bi1.add(bi2);

		System.out.println(bis.toString());
	}

}
