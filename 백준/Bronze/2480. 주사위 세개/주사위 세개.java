import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		long reward = 0;
		
		if (A == B && B == C) {
			reward = 10000 + A * 1000;
		}
		else if ( (A == B && B != C) || (A == C && B != C) )  {
			reward = 1000 + A * 100;
		}
		else if (B == C && A != C) {
			reward = 1000 + B * 100;
		}
		else {
			reward = Math.max(A, Math.max(B, C)) * 100;
		}
		System.out.println(reward);
	}
}