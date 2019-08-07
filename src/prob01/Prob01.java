package prob01;

import java.util.Random;
import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		System.out.print( "금액: " );
		int money = scanner.nextInt();
		
		
		int arr[]= new int[10]; //10개인 배열 생성
		while(true) {
		if(money/50000!=0) {
			arr[0]=money/50000;
			money = money-50000*arr[0];
			System.out.println("50000원  : " +arr[0] + "개");
		}else if(money/10000 !=0) {
			arr[1]=money/10000;
			money = money-10000*arr[1];
			System.out.println("10000원  : " +arr[1] + "개");
		}else if(money/5000!=0) {
			arr[2]=money/5000;
			money=money-5000*arr[2];
			System.out.println("5000원  : " +arr[2] + "개");
		}else if(money/1000!=0) {
			arr[3]=money/1000;
			money = money-1000*arr[3];
			System.out.println("1000원  : " +arr[3] + "개");
		}else if(money/500!=0) {
			arr[4]=money/500;
			money = money-500*arr[4];
			System.out.println("500원  : " +arr[4] + "개");
		}else if(money/100!=0) {
			arr[5]=money/100;
			money = money-100*arr[5];
			System.out.println("100원  : " +arr[5] + "개");
		}else if(money/50!=0) {
			arr[6]=money/50;
			money = money-50*arr[6];
			System.out.println("50원  : " +arr[6] + "개");
		}else if(money/10!=0) {
			arr[7]=money/10;
			money = money-10*arr[7];
			System.out.println("10원  : " +arr[7] + "개");
		}else if(money/5!=0) {
			arr[8]=money/5;
			money = money-5*arr[8];
			System.out.println("5원  : " +arr[8] + "개");
		}else if(money/1!=0) {
			arr[9]=money/1;
			money = money-1*arr[9];
			System.out.println("1원  : " +arr[9] + "개");
			break;
		}
		}
		
		scanner.close();
 	}
}