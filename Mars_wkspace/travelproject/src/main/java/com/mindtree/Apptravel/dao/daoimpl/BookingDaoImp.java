package com.mindtree.Apptravel.dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.Apptravel.dao.BookingDao;
import com.mindtree.Apptravel.entity.BookingDetails;
import com.mindtree.Apptravel.entity.City;
import com.mindtree.Apptravel.utility.DBUtil;

public class BookingDaoImp implements BookingDao {

	
	 private PreparedStatement preparedstatement=null;
	 private String sql;
	 private Connection connection=null;
	 
	 public List <BookingDetails>getbookingdetail(City destination) {
		List<BookingDetails> bookingdetailslist = new ArrayList<BookingDetails>();
		try{
			connection=DBUtil.getconnection();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		sql="select book_id,city.name from bookingdetails,city where destination=(select id from city where name=?) and bookingdetails.source=city.id";
		try {
			preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1, destination.getName());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ResultSet resultset = null;
		try {
			resultset = preparedstatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(resultset.next())
			{
				BookingDetails bookingDetails = new BookingDetails();
				
				bookingDetails.setBook_id(resultset.getInt("book_id"));
				
				 City srccity=new City();
				 srccity.setName(resultset.getString(2));
				 bookingDetails.setSource(srccity);
				 
				 bookingdetailslist.add(bookingDetails);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtil.closeconnection();
		return bookingdetailslist;
	}
	

}
