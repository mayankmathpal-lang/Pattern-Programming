import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchPattern5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
            //int n=5;
		
		 BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(m.readLine());
            for (int i = 1; i<=n; i++) {
				for (int j = 1; j<=n; j++) {
				//	if (i==1||i==5||j==1||j==5) {
						if (i==1||i==n||j==1||j==n) {
						System.out.print("*");
					} else {
                        System.out.print(" ");
					}
				}
				System.out.println();
				
			}
	}

}
