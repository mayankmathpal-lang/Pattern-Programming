import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchPattern2 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
           BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
           int n=Integer.parseInt(s.readLine());
           for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
