//import java.util.Scanner;
//
//public class Solution {
//	static int N,B,C;
//	static int NB[];
//	static int total = 1;
//	static int supervisor;
//	static int exvisor; // �ΰ���
//	public static void main(String[] args){
//		
//		Scanner scan = new Scanner(System.in);
//
//		N = scan.nextInt();
//		// N ������ ����
//		NB = new int[N];
//		for(int i=0; i< N; i++){
//			NB[i] = scan.nextInt();
//		}
//		// �� ������ �ο� �ֱ�
//		B = scan.nextInt();
//		// �뻧 �����
//		C = scan.nextInt();
//		// ���� �����
//		// �� / ������ %
//		for(int j=0; j<N; j++){
//			total++; // �ϴ� 1�� �����ְ�
//			int remainder = (NB[j] - B) % C;
//			// ������ ���ϱ�
//			 supervisor = (NB[j] - B) / C;
//			// ����� �� üũ
//			System.out.println(total);
//			if(remainder == 0){
//				total = supervisor + total;
//			}
//			else {
//				if(supervisor == 0){
//					total = total;
//				}
//			else
//				total = supervisor + 1;
//			}
//				
//		}
//        System.out.println(total);
//		
//	}
//}




import java.util.Scanner;

public class Solution {
	static int N,B,C;
	static int NB[];
	static int total = 0;
	static int supervisor;
	static int exvisor; // �ΰ���
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		// N ������ ����
		NB = new int[N];
		for(int i=0; i< N; i++){
			NB[i] = scan.nextInt();
		}
		// �� ������ �ο� �ֱ�
		B = scan.nextInt();
		// �뻧 �����
		C = scan.nextInt();
		// ���� �����
		// �� / ������ %
		for(int j=0; j<N; j++){
			total++; // �ϴ� 1�� �����ְ�
			 int mok = (NB[j] - B) / C;//��
			 
			 int nam = (NB[j] - B) % C;//������
			 
//			 if(mok == 0){
//				 total = total + mok;
//			 }
//			 else 
//				 total = total + mok + 1;
//			
			 
			 if(mok == 0 && nam == 0){
				 total = total + mok;
			 }
			 else if(mok == 0 && nam != 0)
				 total = total + mok + 1;
			 else if(mok != 0 && nam == 0 )
				 total = total + mok;
			 else if(mok != 0 && nam != 0)
				 total = total + mok + 1;
			 
		}
        System.out.println(total);
		
	}
}