package Sohansaem;

//세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//예를 들어 A = 150, B = 266, C = 427 이라면 
//A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sohansaem_0618 {
	int multi;
	
	private int MultiNum(int x, int y, int z) throws NumberFormatException, IOException {
		
		this.multi= x*y*z;
		return multi;
	}

	private int[] CountNumber() {
		String str = Integer.toString(multi);
		String[] mul = new String [str.length()];
		mul = str.split("");
		int[] count = new int[10];
//		System.out.println(Arrays.toString(mul));
		
		for(int i=0; i<mul.length;i++) {
			switch(mul[i]) {
			case "1": count[0]++; break;
			case "2": count[1]++; break;
			case "3": count[2]++; break;
			case "4": count[3]++; break;
			case "5": count[4]++; break;
			case "6": count[5]++; break;
			case "7": count[6]++; break;
			case "8": count[7]++; break;
			case "9": count[8]++; break;
			case "0": count[9]++; break;
			}
		}
		
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("첫 번째 숫자를 입력");
		a = Integer.parseInt(br.readLine());
		System.out.println("두 번째 숫자를 입력");
		b = Integer.parseInt(br.readLine());
		System.out.println("세 번째 숫자를 입력");
		c = Integer.parseInt(br.readLine());
		

		Sohansaem_0618 test = new Sohansaem_0618();
		
		test.MultiNum(a, b, c);
//		System.out.println(Arrays.toString(test.CountNumber()));
		
		System.out.println("세 수의 곱은 " + test.multi);
		
		
		for(int i=0; i<test.CountNumber().length;i++) {
			System.out.println(test.CountNumber()[i]);
		}
	}
}
