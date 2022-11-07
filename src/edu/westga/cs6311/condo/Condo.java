package edu.westga.cs6311.condo;

/**
 * Create variables, constructors, getters, and setters for:
 * condoNumber, numBedrooms, numBathrooms, sqFootage, listingPrice
 * @author Anna Blood
 * @version 09/16/22
 */
public class Condo {
	private String condoNumber;
	private int numBedrooms;
	private int numBathrooms;
	private int sqFootage; 
	private int parkingNumber;
	private double listingPrice; 
	
	/**
	 * Constructor
	 * @param newCondoNumber sets condoNumber
	 * @param newNumberBedrooms sets numBedrooms
	 * @param newNumberBathrooms sets numBathrooms
	 * @param newSquareFootage sets sqFootage
	 * @param newListingPrice sets listingPrice
	 */
	public Condo(String newCondoNumber, int newNumberBedrooms, 
			int newNumberBathrooms, int newSquareFootage, double newListingPrice, int newParkingNumber) {
		this.condoNumber = newCondoNumber;
		this.numBedrooms = newNumberBedrooms;
		this.numBathrooms = newNumberBathrooms;
		this.sqFootage = newSquareFootage;
		this.listingPrice = newListingPrice;
		this.parkingNumber= newParkingNumber;
	}
	
	/**
	 * Method to get Condo Information
	 * @return condoNumber, beds, baths, sqft, price 
	 */
	public String getCondoInformation() {
		return "Condo Unit: " + this.condoNumber + ", " + this.numBedrooms + " Bed/" 
				+ this.numBathrooms + " Bath with " + this.sqFootage 
				+ "sqFt of living space. Listed at $" 
				+ String.format("%,4.2f", this.listingPrice)
				+ ". Parking at space number " + this.parkingNumber + ".";
	}
	
	/**
	 * Getter for condoNumber
	 * @return the condoNumber
	 */
	public String getCondoNumber() {
		return this.condoNumber;
	}
	
	/**
	 * Setter for condoNumber
	 * @param condoNumber to set condoNumber
	 */
	public void setCondoNumber(String condoNumber) {
		this.condoNumber = condoNumber;
	}

	/**
	 * Getter for numBedrooms
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return this.numBedrooms;
	}
	
	/**
	 * Setter for numBedrooms
	 * @param numBedrooms to set numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * Getter for numBathrooms
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return this.numBathrooms;
	}
	
	/**
	 * Setter for numBathrooms
	 * @param numBathrooms to set numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	/**
	 * Getter for sqFootage
	 * @return the sqFootage
	 */
	public int getSqFootage() {
		return this.sqFootage;
	}
	
	/**
	 * Setter for sqFootage
	 * @param sqFootage to set sqFootage
	 */
	public void setSqFootage(int sqFootage) {
		this.sqFootage = sqFootage;
	}
	
	/**
	 * Getter for listingPrice
	 * @return the listingPrice
	 */
	public double getListingPrice() {
		return this.listingPrice;
	}
	
	/**
	 * Setter for listingPrice
	 * @param listingPrice to set listingPrice
	 */
	public void setListingPrice(double listingPrice) {
		this.listingPrice = listingPrice;
	}
	
	/**
	 * Getter for parkingNumber
	 * @return the parkingNumber
	 */
	public double getParkingNumber() {
		return this.parkingNumber;
	}
	
	/**
	 * Setter for parkingNumber
	 * @param parkingNumber to set parkingNumber
	 */
	public void setParkingNumber(int parkingNumber) {
		this.parkingNumber = parkingNumber;
	}
	
}
