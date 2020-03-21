package com.company;

import sun.applet.Main;

import java.util.Scanner;

public class MainController extends Controller
{
	Scanner sc = new Scanner(System.in);
	int sel = 1;

	public MainController()
	{
	}

	public void start()
	{
		while (sel != 0)
		{
			printMainMenu();
			sel = sc.nextInt();

			switch (sel)
			{
				case 1:
					//CheckInApp.start();
					break;
				case 6:
					printManageGuestMenu();
					break;
				case 0:
					System.exit(0);
					break;
			}
		}
	}

	public void printMainMenu()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~ Welcome to Hotel Reservation App ~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 - ");
		System.out.println("2 - Create new Reservation");
		System.out.println("3 - Make Room Service Order");
		printDivider();
		System.out.println("4 - Reservation Check-in");
		System.out.println("4 - Walk-in Check-in");
		System.out.println("5 - Room Check-out and Print Bill Invoice");
		printDivider();
		System.out.println("6 - Manage Guests");
		System.out.println("7 - Manage Reservations");
		System.out.println("8 - Manage Room Details");
		System.out.println("9 - Manage Room Service Menu Items");
		System.out.println("10 - Manage Room Service Menu Items");
		printDivider();
		System.out.println("0 - Exit Application");
		printDivider();
		System.out.println();
	}

	public void printDivider()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public void printManageGuestMenu()
	{
		System.out.println("~~~~~~~~~~~~~~~~~ Manage Guests ~~~~~~~~~~~~~~~~");
		System.out.println("1 - Update Guest Details");
		System.out.println("2 - Search Guests by Name");
		printDivider();
		System.out.println();
	}

	public void printManageResvMenu()
	{

	}

	public void printManageRoomDetailsMenu()
	{

	}

	public void printManageRoomServiceItemsMenu()
	{

	}
}

