package project5;

import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc=new GregorianCalendar();
		//gc.get(GregorianCalendar.MONTH)返回的月份是从0开始的，显示的时候要+1
		System.out.println("yy-mm-dd: "+gc.get(GregorianCalendar.YEAR)+"-"+(gc.get(GregorianCalendar.MONTH)+1)+"-"+gc.get(GregorianCalendar.DAY_OF_MONTH));
	    
		gc.setTimeInMillis(1234567898765L);
		System.out.println("after set yy-mm-dd: "+gc.get(GregorianCalendar.YEAR)+"-"+(gc.get(GregorianCalendar.MONTH)+1)+"-"+gc.get(GregorianCalendar.DAY_OF_MONTH));
	
	}

}
