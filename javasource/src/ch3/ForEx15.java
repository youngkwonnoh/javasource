package ch3;

public class ForEx15 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) { 
			System.out.print("*");
			}
		System.out.println();	
		}
	}
}


//package ch3;
//
//public class ForEx15 {
//	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=1; j--) {
//				if(j>=i) {
//					System.out.print("*");					
//				}
//			}
//		System.out.println();	
//		}
//	}
//}

//package ch3;
//
//public class ForEx15 {
//	public static void main(String[] args) {
//		for(int i=5; i>0; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//		System.out.println();	
//		}
//	}
//}