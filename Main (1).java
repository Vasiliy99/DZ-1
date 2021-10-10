package com.company;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int c = in.nextInt();
	    if (a>b and a>c){
		System.out.println(a);
	    }
	    if (b>a and b>c){
		System.out.println(b);
	    }
	    else{
	    System.out.println(c);
	    }
	}
}
