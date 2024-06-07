package com.string;

public class ReverseString {
	    public static void main (String[] args) {
	       
	        String str= "Rehan", rev="";
	        char ch;
	       
	      System.out.print("Original word: ");
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        rev= ch+rev; 
	      }
	      System.out.println("Reversed word: "+ rev);
	    }
	}

