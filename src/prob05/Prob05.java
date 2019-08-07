package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		
		//정답 랜덤하게 만들기
		
		while(true) {
			
			int minNumber = 1;
			int maxNumber = 100;
			int cnt = 1;
			
			Random random  = new Random();
			int correctNumber = random.nextInt(maxNumber);
			System.out.println(correctNumber);
			//랜덤수 결정
			
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				System.out.println(minNumber + "-" + maxNumber);
				System.out.print(cnt+ ">>");
				int putNumber = scanner.nextInt();
				if(putNumber==correctNumber) {
					break;
				}else if(correctNumber < putNumber) {
					maxNumber = putNumber;
					cnt++;
					System.out.println("더 낮게");
				}else if(putNumber < correctNumber) {
					minNumber = putNumber;
					cnt++;
					System.out.println("더 높게");
				}
			}
			System.out.println("맞았습니다\n다시하시겠습니까(y/n)");
			String answer = scanner.next();
			if(answer.equals("n")) {
				break;
			}
		

			
		}
		scanner.close();
	}

}