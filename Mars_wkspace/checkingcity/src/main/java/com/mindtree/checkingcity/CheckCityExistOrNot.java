package com.mindtree.checkingcity;

public class CheckCityExistOrNot {

	public static void main(String[] args) {
		City name = new City();
		name.setCity("delhi");
		if(name.getCity()=="delhi")
		{
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
