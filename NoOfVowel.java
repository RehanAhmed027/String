package com.string;

import java.util.Scanner;

public class NoOfVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		int n=str.length();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			
			if((ch=='a' || ch=='A') || (ch=='E' || ch=='e') || 
					(ch=='I'||ch=='i') || (ch=='O'||ch=='o') ||
					 (ch=='u' || ch=='U')) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
