package com.company;

import java.io.Serializable;

public class GuestEntity implements Serializable
{
	private final Integer guestID;
	private String name;
	private String creditCardNum;
	private String address;
	private String country;
	private Character gender;
	private String identityNo;
	private String nationality;
	private String contactNo;

	public GuestEntity(Integer guestID, String name, String creditCardNum, String address, String country, Character gender, String identityNo, String nationality, String contactNo)
	{
		this.guestID = guestID;
		this.name = name;
		this.creditCardNum = creditCardNum;
		this.address = address;
		this.country = country;
		this.gender = gender;
		this.identityNo = identityNo;
		this.nationality = nationality;
		this.contactNo = contactNo;
	}

	@Override
	public String toString()
	{
		return "GuestEntity{" +
				"guestID=" + guestID +
				", name='" + name + '\'' +
				", creditCardNum='" + creditCardNum + '\'' +
				", address='" + address + '\'' +
				", country='" + country + '\'' +
				", gender=" + gender +
				", identityNo='" + identityNo + '\'' +
				", nationality='" + nationality + '\'' +
				", contactNo='" + contactNo + '\'' +
				'}';
	}

	public Integer getGuestID()
	{
		return guestID;
	}


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCreditCardNum()
	{
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum)
	{
		this.creditCardNum = creditCardNum;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public Character getGender()
	{
		return gender;
	}

	public void setGender(Character gender)
	{
		this.gender = gender;
	}

	public String getIdentityNo()
	{
		return identityNo;
	}

	public void setIdentityNo(String identityNo)
	{
		this.identityNo = identityNo;
	}

	public String getNationality()
	{
		return nationality;
	}

	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	public String getContactNo()
	{
		return contactNo;
	}

	public void setContactNo(String contactNo)
	{
		this.contactNo = contactNo;
	}
}
