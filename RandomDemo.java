package project5;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random(1000);
		for(int i=0;i<50;i++) {
			System.out.println("random 0-100: "+rd.nextInt(100));
		}
	}

}
