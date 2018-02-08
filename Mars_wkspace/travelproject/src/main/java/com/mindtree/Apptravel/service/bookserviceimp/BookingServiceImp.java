package com.mindtree.Apptravel.service.bookserviceimp;

import java.util.List;

import com.mindtree.Apptravel.dao.BookingDao;
import com.mindtree.Apptravel.dao.daoimpl.BookingDaoImp;
import com.mindtree.Apptravel.entity.BookingDetails;
import com.mindtree.Apptravel.entity.City;
import com.mindtree.Apptravel.service.BookingService;

public class BookingServiceImp implements BookingService
{
	public List<BookingDetails> getbookingdetails(City destination)
	{
		BookingDao bookingdao= new BookingDaoImp(); 
		
				return bookingdao.getbookingdetail(destination);


	}
  public boolean validate(String name)
  {
	  if(name.equals("delhi"))
	  {
		  return false;
	  }
	  
	  else
		  return true;
		  
  }
}
