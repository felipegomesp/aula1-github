package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		System.out.println("Bom dia");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal");
		for (int i=0;i<n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; i++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
				
		sc.close(); 
	}
}