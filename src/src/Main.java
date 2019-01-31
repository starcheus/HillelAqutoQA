package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Please enter two numbers, less one will be defined");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m<n){
		System.out.println("Less = " + m);}
		else
		System.out.println("Less is " + n);
	}
}
