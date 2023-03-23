package 알고리즘.백준.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

public class _11727_2XN타일링2 {

	@Test
	void main() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[1001];
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 5;
		
		for(int i = 4; i <= n; i++) {
			arr[i] = (arr[i-1] + arr[i-2] + arr[i-2]) % 10007;
		}
		
		System.out.println(arr[n]);
	}
}
