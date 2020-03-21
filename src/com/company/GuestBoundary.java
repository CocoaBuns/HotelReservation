package com.company;

import java.util.Scanner;

public class GuestBoundary implements IBoundary
{
	private Scanner sc;

	public GuestBoundary()
	{
		sc = new Scanner(System.in);
	}

	@Override
	public int process()
	{
		return 0;
	}
}
