package com.mindtree.Apptravel.service;

import java.util.List;

import com.mindtree.Apptravel.entity.BookingDetails;
import com.mindtree.Apptravel.entity.City;

public interface BookingService {
public List<BookingDetails> getbookingdetails(City destination);
}
