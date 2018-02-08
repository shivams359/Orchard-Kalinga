package com.mindtree.Apptravel.manager;

import java.util.Scanner;

import com.mindtree.Apptravel.entity.BookingDetails;
import com.mindtree.Apptravel.entity.City;
import com.mindtree.Apptravel.service.BookingService;
import com.mindtree.Apptravel.service.bookserviceimp.BookingServiceImp;

public class Application {

	public static void main(String[] args) 
	{
		BookingService bookingservice=new BookingServiceImp();
		BookingServiceImp m=new BookingServiceImp();
		City destination = new City();
		String name="delhi";
	    if(m.validate(name)){
	    	destination.setName(name);
	    }
	    else{
	    	System.out.println("invalid destination");
	    }
		for(BookingDetails b:bookingservice.getbookingdetails(destination))
		{
			System.out.println("Booking_id="+ b.getBook_id()+"\tSource="+ b.getSource().getName());
		}
	}

}
