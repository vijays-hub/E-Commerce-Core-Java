package com.EntryArea.amazon;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class CartZone
{
	static ArrayList cartList= new ArrayList();
	static Scanner cart_scan= new Scanner(System.in);
	public static ArrayList<Double> prices= new ArrayList<Double>();
	public static ArrayList productDetails= new ArrayList();

	public static void addCart(double price, String product_name, String product_color) throws InterruptedException, IOException
	{
		prices.add(price);
		productDetails.add(product_name+" "+product_color);
		cartList.add(product_name+","+product_color+","+price);

		Thread.sleep(1000);
		System.out.println(product_name+" has been Added to Cart Succesfully!!!");
		System.out.println();
		System.out.println("Items in Your Cart Are: ");
		System.out.println(cartList+" \n");
		System.out.println();
		System.out.println("Do You Want to Continue Shopping? \n1.Yes \n2.No");
		System.out.println();
		switch(cart_scan.nextInt())
		{
		case 1: 
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Categories.category_list();
			break;
		case 2: 
			System.out.println(" A.View Cart Items \nB.Proceed to Checkout! \nC.Take Me to HomePage");
			switch(cart_scan.next().charAt(0))
			{
			case 'A': 
				System.out.print("Loading");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				CartZone.viewCart();
				break;
			case 'a': 
				System.out.print("Loading");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				CartZone.viewCart();
				break;
			case 'B':
				System.out.print("Loading");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				PaymentArea.payment_Methods();
				break;
			case 'b': 
				System.out.print("Loading");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				PaymentArea.payment_Methods();
				break;
			case 'C': 
				System.out.print("Loading");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Home.MainMethod();
				break;
			case 'c': 
				System.out.print("Loading");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				Home.MainMethod();
				break;
			}
			break;
		}
	}
	public static void cart() throws InterruptedException, IOException
	{
		System.out.println("1. View Cart");
		System.out.println("2.Remove From Cart");

		if(cart_scan.nextInt()==1)
		{
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			viewCart();
		}
		else if(cart_scan.nextInt()==2)
		{
			System.out.print("Loading");
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			removeCart();
		}

	}

	public static void viewCart() throws InterruptedException, IOException
	{
		System.out.println("---------Your Bag Items Zone--------");
		System.out.println();
		if(cartList.size()==0)
		{
			System.out.println("There are No Items in Your Bag \n\n Purchase Something or Add to Bag");
			System.out.println("\n Do You want us to take to Shopping Zone?");
			System.out.println("1.Yes \n2.No");

			try
			{
				switch(cart_scan.next())
				{
				case "YES": 
					System.out.print("Taking You to Shopping Zone");
					for(int i=0;i<2;i++)
					{
						System.out.print(".");
						Thread.sleep(1000);
					}
					System.out.println();
					Categories.category_list();
					break;

				case "yes": 
					System.out.print("Taking You to Shopping Zone");
					for(int i=0;i<2;i++)
					{
						System.out.print(".");
						Thread.sleep(1000);
					}
					System.out.println();
					Categories.category_list();
					break;

				case "no": 
					System.out.print("What do you wish us to do?");
					System.out.println("1.Take Me to Home Page \n2.Leave me Alone!!!");
					switch(cart_scan.nextInt())
					{
					case 1: Home.MainMethod();
					break;
					case 2: System.out.println("Are You Sure You want to Exit? \n1.Y \2.N ");

					switch(cart_scan.next().charAt(0))
					{
					case 1: Exit.exit();
					break;
					case 2: Home.MainMethod();
					break;
					}
					}
					break;

				case "NO": 
					System.out.print("What do you wish us to do?");
					System.out.println("1.Take Me to Home Page \n2.Leave me Alone!!!");
					switch(cart_scan.nextInt())
					{
					case 1: Home.MainMethod();
					break;
					case 2: System.out.println("Are You Sure You want to Exit? \n1.Y \2.N ");

					switch(cart_scan.next().charAt(0))
					{
					case 1: Exit.exit();
					break;
					case 2: Home.MainMethod();
					break;
					}
					break;
					}
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter valid input!");
			}
		}

		if(cartList.size()>0)
		{
			Iterator i = cartList.iterator();
			System.out.println("Items in Your Bag are:");
			int j=1;
			while(i.hasNext()==true)
			{
				System.out.println((j)+". "+i.next());
				++j;
			}
			System.out.println();
			System.out.println("1.Proceed to checkout! \n2.Remove items From Cart \n3.Shop More \n4.Goto Home \n5.Exit");
			int choice=cart_scan.nextInt();
			if(choice==1)
			{
				PaymentArea.payment_Methods();
			}
			else if(choice==2)
			{
				removeCart();
			}
			else if(choice==3)
			{
				Categories.category_list();
			}
			else if(choice==4)
			{
				Home.MainMethod();
			}
			else if(choice==5)
			{
				Exit.exit();
			}
			else
			{
				System.out.println("Invalid Input....Taking you to Bag Zone");
				for(int k=0;k<3;k++)
				{
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				viewCart();
			}

		}
	}
	public static void removeCart() throws InterruptedException, IOException
	{
	
		if(cartList.size()==0)
		{
			System.out.println("There are No Items in your Cart!");
			System.out.println("\n Purchase Something!!!");
			System.out.println("\n Do You want us to take to Shopping Zone?");
			System.out.println("1.Yes \n2.No");

			try
			{
				switch(cart_scan.next())
				{
				case "YES": 
					System.out.print("Taking You to Shopping Zone");
					for(int i=0;i<2;i++)
					{
						System.out.print(".");
						Thread.sleep(1000);
					}
					System.out.println();
					Categories.category_list();
					break;

				case "yes": 
					System.out.print("Taking You to Shopping Zone");
					for(int i=0;i<2;i++)
					{
						System.out.print(".");
						Thread.sleep(1000);
					}
					System.out.println();
					Categories.category_list();
					break;

				case "no": 
					System.out.print("What do you wish us to do?");
					System.out.println("1.Take Me to Home Page \n2.Leave me Alone!!!");
					switch(cart_scan.nextInt())
					{
					case 1: Home.MainMethod();
					break;
					case 2: System.out.println("Are You Sure You want to Exit? \n1.Y \2.N ");

					switch(cart_scan.next().charAt(0))
					{
					case 1: Exit.exit();
					break;
					case 2: Home.MainMethod();
					break;
					}
					}
					break;

				case "NO": 
					System.out.print("What do you wish us to do?");
					System.out.println("1.Take Me to Home Page \n2.Leave me Alone!!!");
					switch(cart_scan.nextInt())
					{
					case 1: Home.MainMethod();
					break;
					case 2: System.out.println("Are You Sure You want to Exit? \n1.Y \2.N ");

					switch(cart_scan.next().charAt(0))
					{
					case 1: Exit.exit();
					break;
					case 2: Home.MainMethod();
					break;
					}
					break;
					}
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter valid input!");
			}
		}
		else if(cartList.size()>0)
		{
			System.out.println("Loading Bag items");
			for(int k=0;k<3;k++)
			{
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("Items in the Bag");
			Iterator i = cartList.iterator();
			int j=1;
			while(i.hasNext()==true)
			{
				System.out.println((j)+". "+i.next());
				++j;
			}
			System.out.println("Select What to Remove....\n");
			try
			{
				int remChoice= cart_scan.nextInt();
				if(remChoice<=cartList.size())
				{
					System.out.println("Are You Sure You want to remove the item from Bag? \nY \nN");
					char confirm= cart_scan.next().charAt(0);
					
					if(confirm=='Y' || confirm=='y')
					{
						for(int ii=0;ii<cartList.size();ii++)
						{
							cartList.remove(remChoice-1);
							prices.remove(remChoice-1);
							System.out.println("Refreshing your Items in the Bag");
							System.out.println();
							Iterator it = cartList.iterator();
							int jj=1;
							if(cartList.size()==0)
							{
								System.out.println("Bag has become Empty!!");
								System.out.println("Taking you back home!");
								for(int k=0;k<3;k++)
								{
									System.out.print(".");
									Thread.sleep(1000);
								}
								System.out.println();
								Home.MainMethod();
								break;
							}
							else
							{
								while(it.hasNext()==true)
								{
									System.out.println((jj)+". "+it.next());
									++jj;
								}
								System.out.println("1. Proceed to check these items \n2.Go back Home \n.Any number to Exit!");
								int ch= cart_scan.nextInt();
								if(ch==1)
								{
									System.out.println("Taking you to Payments Zone");
									for(int k=0;k<3;k++)
									{
										System.out.print(".");
										Thread.sleep(1000);
									}
									System.out.println();
									PaymentArea.payment_Methods();
								}
								else if(ch==2)
								{
									System.out.println("Taking you back to Home");
									for(int k=0;k<3;k++)
									{
										System.out.print(".");
										Thread.sleep(1000);
									}
									System.out.println();
									Home.MainMethod();
								}
								else
								{
									Exit.exit();
								}
							}	
						}
					}
					else
					{
						removeCart();
					}
				}
				else
				{
					System.out.println("Invalid selection!!!");
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input");
			}
		}
	}
}
