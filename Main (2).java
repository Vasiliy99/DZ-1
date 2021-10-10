package com.company;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int S = (2*a+(b-1)*10)*b/2;
		System.out.println(S);
	}
}
