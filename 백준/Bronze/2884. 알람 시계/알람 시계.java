import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if (M < 45) {
			M = M + 15; 
			if (H != 0) {
				H--;
			}
			else {
				H = H + 23;
			}
			System.out.println(H + " " + M);
			
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
