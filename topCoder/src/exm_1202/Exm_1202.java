package exm_1202;

import java.io.*;

public class Exm_1202 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.���� 2.����");
		
		int x = Integer.parseInt(in.readLine());
		
		String str = x == 1 ? "����" : "����" ;
		
		System.out.println(str);
	}
}
