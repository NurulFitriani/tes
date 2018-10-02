package tipedata;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
			boolean Pintar = false;
			Pintar = true;
			System.out.println("jawab dengan: true/false ");
			Scanner scw = new Scanner(System.in);
			System.out.println("Apakah Saya Pintar: ");
			Pintar = scw.nextBoolean();
			if(Pintar==true) {
				System.out.println("Saya Pintar");
			}else {
				System.out.println("Saya tidak Pintar tapi saya tidak bodoh ");
			}
			
			
			
		}

	}
