//package com.Myexp;
/**
	猜数，1~100之间的数
 */
import java.util.Scanner;
public class Fir_exp1
{
	public static void main(String[] args)
	{
        Scanner reader = new Scanner(System.in);
        
		boolean f = true;
		while(f)
		{
            System.out.println("猜数游戏开始，请输入一个数");

			int cnt = 0;
            int NUM = (int) (Math.random()*100 + 1);

            while(true)
            {
                cnt ++;
                int input_num = reader.nextInt();
                if(input_num > NUM){
                    System.out.println("猜大了，again");
                }
                else if(input_num < NUM){
                    System.out.println("猜小了，again");
                }
                else{
                    System.out.println("猜对了，猜了" + cnt + "次，nice!");
                    break;
                }
            }
            
			System.out.println("继续游戏请按'1' ， 否则请按'0'");
			int tmp = reader.nextInt();
			if(tmp == 1)
				f = true;
			else
				f = false;
		}
	}
}



