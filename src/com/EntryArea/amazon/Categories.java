package com.EntryArea.amazon;
import com.EchoAndAlexa.*;
import com.EchoAndAlexa.amazon.Echo;
import com.MensFashion.java.MensMain;
import com.MobilesAndComputers.amazon.MobilesAndComputers;
import com.TvElectronicsAppliances.TEAAllCategories;
import com.MobilesAndComputers.amazon.MobilesAndComputers;

import java.io.IOException;
import java.util.*;
public class Categories
{
	public static void category_list() throws InterruptedException, IOException
	{
		Scanner cate_scan= new Scanner(System.in);
		System.out.println("Shop By Category");
		System.out.println("-----------------------------------");
		Thread.sleep(500);
		System.out.println("1.Echo & Alexa");
		Thread.sleep(500);
		System.out.println("2.Mobiles, Computers");
		Thread.sleep(500);
		System.out.println("3.TV,Appliances,Electronics");
		Thread.sleep(500);
		System.out.println("4.Men's Fashion");
		Thread.sleep(500);
		
		switch(cate_scan.nextInt())
		{
		case 1: 
			System.out.print("Loading");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Echo.echo_categories();
		break;
		case 2: 
			System.out.print("Loading");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			MobilesAndComputers.mob_categories();
		break;
		case 3:
			System.out.print("Loading");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			TEAAllCategories.teaCategories();
		break;
		case 4: 
			System.out.print("Loading");
			for(int i=0;i<2;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			MensMain.men_categories();
		break;

		default : System.out.println("Invalid Choice..Try Again");
		Categories.category_list();
		break;
		
		}
		
		
	}
}
