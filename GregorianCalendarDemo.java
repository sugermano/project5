package project5;

import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc=new GregorianCalendar();
		//gc.get(GregorianCalendar.MONTH)���ص��·��Ǵ�0��ʼ�ģ���ʾ��ʱ��Ҫ+1
		System.out.println("yy-mm-dd: "+gc.get(GregorianCalendar.YEAR)+"-"+(gc.get(GregorianCalendar.MONTH)+1)+"-"+gc.get(GregorianCalendar.DAY_OF_MONTH));
	    
		gc.setTimeInMillis(1234567898765L);
		System.out.println("after set yy-mm-dd: "+gc.get(GregorianCalendar.YEAR)+"-"+(gc.get(GregorianCalendar.MONTH)+1)+"-"+gc.get(GregorianCalendar.DAY_OF_MONTH));
	
	}

}
