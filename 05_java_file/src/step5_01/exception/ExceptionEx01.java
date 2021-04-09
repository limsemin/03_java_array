package step5_01.exception;

/*
 * 
 * # 예외 (Exception) 처리
 * 
 * 심각한 오류를 발생시킬수 있는 내용은
 * try , catch 구문안에 만들도록 강제한다.
 * 
 * try : 에러가 나지 않을 경우 정상적으로 실행 될 명령어
 * catch : try{} 안의 명령어가 실행되는 중 에러가 발생할 경우 분기되는 명령어
 * 
 *  - try 없이 catch가 단독으로 올 수 없고 , catch 없이 try가 단독으로 올 수 없다.
 * 
 * 
 * */



public class ExceptionEx01 {

	public static void main(String[] args) {
		
		try {
			int[]testArr = new int[5];
			System.out.println(testArr[0]);
			
			//System.out.println(testArr[999]);
			//ArrayIndexOutOfBoundsException
			
			//System.out.println(testArr[0] / 0);
			//ArithmeticException
			
			
		}catch (ArithmeticException e) {
			//System.out.println("연산오류");
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("배열 범위 초과 오류");
		}catch(Exception e) {
			System.out.println("Exception클래스는 모든 에러 클래스의 조상 클래스");
		}
	}

}
