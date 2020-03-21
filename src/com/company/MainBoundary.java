package com.company;

import java.util.Scanner;

public class MainBoundary implements IBoundary
{
	private Scanner sc;

	public MainBoundary()
	{
		sc = new Scanner(System.in);
	}

	@Override
	public int process()
	{
		printMenu();
		return 1;
	}

	private void printMenu()
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

	private void printDivider()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
