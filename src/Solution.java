//import java.util.Scanner;
//
//public class Solution {
//	static int N,B,C;
//	static int NB[];
//	static int total = 1;
//	static int supervisor;
//	static int exvisor; // 부감독
//	public static void main(String[] args){
//		
//		Scanner scan = new Scanner(System.in);
//
//		N = scan.nextInt();
//		// N 시험장 갯수
//		NB = new int[N];
//		for(int i=0; i< N; i++){
//			NB[i] = scan.nextInt();
//		}
//		// 각 시험장 인원 넣기
//		B = scan.nextInt();
//		// 대빵 시험관
//		C = scan.nextInt();
//		// 보조 시험관
//		// 몫 / 나머지 %
//		for(int j=0; j<N; j++){
//			total++; // 일단 1명 더해주고
//			int remainder = (NB[j] - B) % C;
//			// 나머지 구하기
//			 supervisor = (NB[j] - B) / C;
//			// 시험관 수 체크
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
	static int exvisor; // 부감독
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		// N 시험장 갯수
		NB = new int[N];
		for(int i=0; i< N; i++){
			NB[i] = scan.nextInt();
		}
		// 각 시험장 인원 넣기
		B = scan.nextInt();
		// 대빵 시험관
		C = scan.nextInt();
		// 보조 시험관
		// 몫 / 나머지 %
		for(int j=0; j<N; j++){
			total++; // 일단 1명 더해주고
			 int mok = (NB[j] - B) / C;//몫
			 
			 int nam = (NB[j] - B) % C;//나머지
			 
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