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
        //��ʼѡ������
        for(int i = 0; i < number.length - 1; i++) {// ����i������
            int k = i;
            for(int j = k + 1; j < number.length; j++){// ѡ��С�ļ�¼
                if(number[j] < number[k]){ 
                    k = j; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
                }
            }
            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
            if(i != k){  //����a[i]��a[k]
                int temp = number[i];
                number[i] = number[k];
                number[k] = temp;
            }    
        }
        sw.stop();
        elapse=sw.getElapsedTime();
        System.out.println("ʹ��ѡ�������100 000�����ֽ��������ʱ��Ϊ��"+elapse+"ms");
	}

}
