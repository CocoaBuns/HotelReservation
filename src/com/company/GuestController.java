package com.company;

import java.util.ArrayList;

public class GuestController extends Controller
{
	private GuestBoundary boundary;
	private ArrayList<GuestEntity> guestList = new ArrayList<GuestEntity>();

	public GuestController()
	{
		boundary = new GuestBoundary();
	}

	public void process()
	{
		int sel = boundary.process();
	}
}
