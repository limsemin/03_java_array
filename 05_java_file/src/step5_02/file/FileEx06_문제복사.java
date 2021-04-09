package step5_02.file;


import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 벡터

public class FileEx06_문제복사 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		
		while (true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {}
			else if (sel == 2) {}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
