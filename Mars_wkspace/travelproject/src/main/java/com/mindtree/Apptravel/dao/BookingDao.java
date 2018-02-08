package com.mindtree.Apptravel.dao;

import java.util.List;

import com.mindtree.Apptravel.entity.BookingDetails;
import com.mindtree.Apptravel.entity.City;

public interface BookingDao {
	List<BookingDetails> getbookingdetail(City destination);
}
