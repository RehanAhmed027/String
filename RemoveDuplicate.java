package com.string;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = input.length();
		String ans = "";

		for (int i = 0; i < n; i++) {
			if (i <n-1 && input.charAt(i) == input.charAt(i + 1)) {
				continue;
			} else {
				ans = ans + input.charAt(i);
			}
		}
		System.out.println(ans);

	}
}
