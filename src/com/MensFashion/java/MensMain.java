package com.MensFashion.java;

import java.io.IOException;
import java.util.Scanner;

public class MensMain {
	
	static Scanner scan= new Scanner(System.in);

	public static void men_categories() throws InterruptedException, IOException {
		System.out.println("Mens Fashion Corner ");	
		System.out.print("Fetching all Mens Categories");
		for(int i=0;i<2;i++)
		{
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("-----Categories Available-----");
		System.out.println("What do you crave for today?");
		System.out.println("1.Clothing \n2.Shoes \n3.Watches \n4.Sunglasses");
		System.out.println();
		System.out.println("Mention Your Choice!");
		switch(scan.nextInt())
		{
		case 1: 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			clothing();
			break;
			
		case 2: 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			shoes();
			break;
			
			
		case 3: 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			watches();
			break;
			
		case 4: 
			System.out.print("Processing");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			sunglasses();
			break;
		}


	}

	public static void clothing() throws IOException, InterruptedException {
		Clothes.getClothes();
	}
	public static void shoes() throws InterruptedException, IOException {
		Shoes.getShoes();	
		}
	public static void watches () throws InterruptedException, IOException {
		Watches.getWatches();
		}
	public static void sunglasses() throws InterruptedException, IOException {
		Sunglasses.getSunglasses();
		}
}
