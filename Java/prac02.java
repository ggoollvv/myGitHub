
public class prac02 {
	public static void main(String []args) {
		Star myStar = new Star(); // myStar��ü ����
		myStar.star1(); // star1 �޼ҵ� ȣ��
		myStar.star2(); // star2 �޼ҵ� ȣ��
		myStar.star3(); // star3 �޼ҵ� ȣ��
		myStar.number();// number �޼ҵ� ȣ��
	}
}

class Star{
	public void star1() { 
		for(int row=0; row<5; row++) { // row�� 5���Դϴ�.
			for(int column=0; column<5; column++) { // column�� 0���ͽ����� 1�� 4���� �����ϸ� �ݺ��մϴ�.
				System.out.print("*");
			} 
			System.out.println(""); // row���Ѿ�� �����ٷ� �Ѿ�ϴ�.
		}
		System.out.println("");
	}
	
		public void star2() {
		for(int row=0; row<5; row++) { // row�� 5���Դϴ�.
			for(int column=5; column>row; column--) { // column�� 5���ͽ�����  row+1 ���� 1�� �����ϸ� �ݺ��մϴ�.   
				System.out.print("*");
			}
			System.out.println(""); // row���Ѿ�� �����ٷ� �Ѿ�ϴ�.
		}
		System.out.println("");
	}
		
		public void star3() {
			for(int row=1; row<6; row++) {  // row�� 5���Դϴ�.
				for(int columnBlank=5; columnBlank>row; columnBlank--) { // columnBlank�� 5���ͽ����� row+1 ���� 1�� �����ϸ� �ݺ��մϴ�.
					System.out.print(" "); // �������
				}
				for(int columnStar=0; columnStar<row; columnStar++) { // columnStar�� 0���ͽ����� row-1 ���� 1�� �����ϸ� �ݺ��մϴ�.
					System.out.print("*"); // *����
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
				for(int column=0; column<blank; column++) { // ������ �����ϴ� �ݺ����Դϴ�.
 					System.out.print(" "); 
				}
				for(int k=0; k<maxNumber1; k++) { // ���ڸ� ����ϴ� �ݺ����Դϴ�.
					System.out.print(number+" "); 
					number = number+1; // �ݺ��ɶ�����  number �� 1�� ���մϴ�.
				}
				System.out.println();
				number=1; // Row������ ������ number�� 1�� �ʱ�ȭ
				blank = blank - 1; // Row������ ������ blank�� 1����
				maxNumber1 = maxNumber1+1; // Row������ ������ MaxNumber 1����
			}
			
			blank = 2; 
			
			for(int row=0; row<3; row++) {
				for(int columnBlank=0; columnBlank<blank; columnBlank++) { // ������ �����ϴ� �ݺ����Դϴ�.
					System.out.print(" ");
				}
				for(int columnStar=0; columnStar<maxNumber2; columnStar++) { // ���ڸ� ����ϴ� �ݺ����Դϴ�.
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