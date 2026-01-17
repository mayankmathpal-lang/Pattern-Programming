import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunnchPattern4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
		int e=Integer.parseInt(n.readLine());
		printPattern(e);
	} 
		
		public static void printPattern(int n) {
			
		for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=i; j++) {
					System.out.print(i+" ");
					
				}
				System.out.println();
				
		}
		}
}
//					if (i==1&&j<2) {
//						System.out.print("1");
//					}
//						if (i==2&&j<3) {
//						System.out.print("2");	
//						}
//							if (i==3&&j<4) {
//								System.out.print("3");
//							}
//								if (i==4&&j<5) {
//								System.out.print("4");	
//					           }
//								if (i==5) {
//								System.out.print("5");	
//								}
//				}
//				System.out.println();
//			}
//		}

	

	


