package project5;

import java.util.Random;

public class StopWatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long elapse=0;
		StopWatch sw=new StopWatch();
		int[] number=new int[100000];
		Random rd=new Random(3000);
		for(int i=0;i<100000;i++) {
			number[i]=rd.nextInt(10000000);
		}
		sw.start();
        //开始选择排序
        for(int i = 0; i < number.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < number.length; j++){// 选最小的记录
                if(number[j] < number[k]){ 
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if(i != k){  //交换a[i]和a[k]
                int temp = number[i];
                number[i] = number[k];
                number[k] = temp;
            }    
        }
        sw.stop();
        elapse=sw.getElapsedTime();
        System.out.println("使用选择排序对100 000个数字进行排序的时间为："+elapse+"ms");
	}

}
