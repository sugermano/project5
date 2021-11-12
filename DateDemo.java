package project5;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		long time=10000;
		for(int i=0;i<8;i++) {
			date.setTime(time);
			System.out.println("date "+time+": "+date.toString());
			time*=10;
		}
	}

}
