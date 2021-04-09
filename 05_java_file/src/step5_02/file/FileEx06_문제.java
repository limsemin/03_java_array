package step5_02.file;


import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 벡터

public class FileEx06_문제 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		
		while (true) {
			
			for(int i=0; i<elementCnt; i++) {
				System.out.println(vector[i]+ " ");
			}
			System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if(elementCnt == 0) {
					vector = new int [elementCnt + 1];
					
				}
				else if(elementCnt > 0) {
					int temp[] = vector;
					vector = new int [elementCnt + 1];
					for(int i=0; i<elementCnt; i++) {
					vector[i] = temp[i];
					temp=null;
					}
				
				}
			System.out.print("데이터 추가:");
			int data = scan.nextInt();
			vector[elementCnt] = data;
			elementCnt++;
			}
			else if (sel == 2) {
				System.out.println("삭제할 인덱스 입력: ");
			int delidx = scan.nextInt();
			if(elementCnt - 1 < delidx || delidx < 0) {
				System.out.println("인덱스를 삭제할 수 없습니다.");
					continue;
			}
			if(elementCnt == 1) {
				vector = null;
			}else if(elementCnt > 1){
				int[]temp = vector;
				vector = new int[elementCnt -1];
				int i=0;
				for (int j = 0; j <elementCnt; j++) {
					if(i != delidx);
					vector[i] = temp[j];
					i++;
					temp = null;
				}
			}
			}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
