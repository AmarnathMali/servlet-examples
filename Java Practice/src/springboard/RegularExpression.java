package springboard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("f......");
		Matcher mat = pat.matcher("farahan");
		boolean result = mat.matches();
		System.out.println(result);
	}

}
