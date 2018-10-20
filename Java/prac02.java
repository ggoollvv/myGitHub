
public class prac02 {
	public static void main(String []args) {
		Star myStar = new Star(); // myStar객체 생성
		myStar.star1(); // star1 메소드 호출
		myStar.star2(); // star2 메소드 호출
		myStar.star3(); // star3 메소드 호출
		myStar.number();// number 메소드 호출
	}
}

class Star{
	public void star1() { 
		for(int row=0; row<5; row++) { // row는 5줄입니다.
			for(int column=0; column<5; column++) { // column이 0부터시작해 1씩 4까지 증가하며 반복합니다.
				System.out.print("*");
			} 
			System.out.println(""); // row가넘어가면 다음줄로 넘어갑니다.
		}
		System.out.println("");
	}
	
		public void star2() {
		for(int row=0; row<5; row++) { // row는 5줄입니다.
			for(int column=5; column>row; column--) { // column이 5부터시작해  row+1 까지 1씩 감소하며 반복합니다.   
				System.out.print("*");
			}
			System.out.println(""); // row가넘어가면 다음줄로 넘어갑니다.
		}
		System.out.println("");
	}
		
		public void star3() {
			for(int row=1; row<6; row++) {  // row는 5줄입니다.
				for(int columnBlank=5; columnBlank>row; columnBlank--) { // columnBlank는 5부터시작해 row+1 까지 1씩 감소하며 반복합니다.
					System.out.print(" "); // 공백생성
				}
				for(int columnStar=0; columnStar<row; columnStar++) { // columnStar는 0부터시작해 row-1 까지 1씩 증가하며 반복합니다.
					System.out.print("*"); // *생성
				}
			System.out.println("");
			}
			
			System.out.println("");
		}
		
		public void number() {
			int number=1;
			int blank=4;
			int maxNumber1=1;
			int maxNumber2=3;
			
			for(int Row=0; Row<4; Row++) { 
				for(int column=0; column<blank; column++) { // 공백을 생성하는 반복문입니다.
 					System.out.print(" "); 
				}
				for(int k=0; k<maxNumber1; k++) { // 숫자를 출력하는 반복문입니다.
					System.out.print(number+" "); 
					number = number+1; // 반복될때마다  number 에 1을 더합니다.
				}
				System.out.println();
				number=1; // Row한줄이 끝나면 number을 1로 초기화
				blank = blank - 1; // Row한줄이 끝나면 blank는 1감소
				maxNumber1 = maxNumber1+1; // Row한줄이 끝나면 MaxNumber 1증가
			}
			
			blank = 2; 
			
			for(int row=0; row<3; row++) {
				for(int columnBlank=0; columnBlank<blank; columnBlank++) { // 공백을 생성하는 반복분입니다.
					System.out.print(" ");
				}
				for(int columnStar=0; columnStar<maxNumber2; columnStar++) { // 숫자를 출력하는 반복문입니다.
					System.out.print(number+" ");
					number = number+1;
				}
				System.out.println();
				number = 1;
				blank = blank+1;
				maxNumber2 = maxNumber2-1;
				}
		}
}