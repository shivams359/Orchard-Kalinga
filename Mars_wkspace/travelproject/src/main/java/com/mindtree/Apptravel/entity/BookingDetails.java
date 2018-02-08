package com.mindtree.Apptravel.entity;

public class BookingDetails {
	private int book_id;
	private  City source;
	private  City destination;
	private Vehicle vehicle;
	private long phone;
	public BookingDetails() {
		super();
	
	}
	public BookingDetails(int book_id, City source, City destination, Vehicle vehicle, long phone) {
		super();
		this.book_id = book_id;
		this.source = source;
		this.destination = destination;
		this.vehicle = vehicle;
		this.phone = phone;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public City getSource() {
		return source;
	}
	public void setSource(City source) {
		this.source = source;
	}
	public City getDestination() {
		return destination;
	}
	public void setDestination(City destination) {
		this.destination = destination;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + book_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		if (book_id != other.book_id)
			return false;
		return true;
	}
	
	
}
