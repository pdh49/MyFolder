package kr.human.java0428;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// 예외가 발생할 소지가 있는 부분을 try 블록으로 감싼다.
			try {
				System.out.println("두개의 정수 입력 : ");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int result = x/y;
				
				System.out.println(x+ "/"+y+"="+result);
				// 여러개 예외를 |(Bit OR)로 연결해서 한번에 쓸수있다.
			} catch (ArithmeticException | InputMismatchException e) { //JDK 1.7이상 지원
				System.out.println("예외발생 : " + e.getMessage());
				e.printStackTrace(); // 예외추적
			}

			}catch (Exception e) { //조상클래스다보니 이 catch는 모든 catch의 마지막에 나와야한다.  
				// 모든 예외클래스의 조상클래스는 Excepetion이다. 모든 예외를 다 받아준다.
				System.out.println("알수 없는 예외입니다.");
			}finally {
				System.out.println("예외 발생 유무와 상관없이 무조건 실행된다.");
				//사용 자원의 종료를 지정한다.
			}
			sc.close();
		}
}
