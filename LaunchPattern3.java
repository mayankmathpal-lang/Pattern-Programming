
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchPattern3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(a.readLine());
         for (int i = 1; i <=n; i++) {
			for (int j = 1; j<=i; j++) {
				
				System.out.print(j+" ");
				
				
			}
			System.out.println();
     	}
			
		}
	}
//			


