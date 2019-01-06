package com.spuppi.introducao;

public class Aula22 {

	/*
	 * Arryas parte 5
	 * Multidimensionais
	 * 
	 */
	
	
	public static void exemplo() {
		
		int[][] dias = new int[3][];		
		dias[0] = new int[2];
		dias[1] = new int[]{1,2,3};
		dias[2] = new int[4];
		
		for(int[] arr : dias) {
			for(int num : arr ) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		exemplo();
	}
}
