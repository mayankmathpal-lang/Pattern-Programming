import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchPattern6 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader l  = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(l.readLine());
       for (int i =1; i<= n; i++) {
		    for (int j =n-i; j>=1; j--) {
				System.out.print(" ");
			}
		    for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
		    System.out.println();
	}
      
	}

}
