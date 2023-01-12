package springboard;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.toGMTString());
		System.out.println(d.getDate());
		System.out.println(d.getHours());
	}

}
