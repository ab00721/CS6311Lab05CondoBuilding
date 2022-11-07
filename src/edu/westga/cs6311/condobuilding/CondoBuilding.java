package edu.westga.cs6311.condobuilding;

import edu.westga.cs6311.condo.Condo;

/**
 * Create variables, constructors, methods, getters, and setters for:
 * buildingAddress, buildingName, buildingAmenities, condos
 * @author Anna Blood
 * @version 09/16/22
 */
public class CondoBuilding {
	
	private static final double HOA_PERCENT = 0.089;
	private String buildingAddress;
	private String buildingName;
	private String buildingAmenities;
	private Condo condoOne;
	private Condo condoTwo;
	private Condo condoThree;
	private Condo condoFour;
	private double average;
	
	/**
	 * Constructor
	 * @param newBuildingName set buildingName
	 * @param newBuildingAddress set buildingAddress
	 * @param newBuildingAmenities set buildingAmenities 
	 */
	public CondoBuilding(String newBuildingName, String newBuildingAddress, 
			String newBuildingAmenities) {
		this.buildingName = newBuildingName;
		this.buildingAddress = newBuildingAddress;
		this.buildingAmenities = newBuildingAmenities;
		this.condoOne = new Condo("1A", 3, 2, 1050, 151675.99, 15);
		this.condoTwo = new Condo("7B", 2, 2, 925, 125479.99, 7);
		this.condoThree = new Condo("12F", 1, 1, 600, 115023.99, 129);
		this.condoFour = new Condo("9C", 3, 1, 1000, 132894.99, 34);
	}
	
	/**
	 * Method to get condoBuilding information
	 * @return buildingName, buildingAddress, buildingAmenities 
	 */
	public String getBuildingInformation() {
		return this.buildingName + ", located at " + this.buildingAddress 
				+ ", features the following amenities: " 
				+ this.buildingAmenities + "." + " 4 units currently available.";
	}
	
	/**
	 * Method to get condo info on two available condos
	 * @return condoInformation of two condos
	 */
	public String getAvailableCondoInfo() {
		return "\n" + this.condoOne.getCondoInformation() + "\n" + this.condoThree.getCondoInformation();
		
	}
	
	/**
	 * Method to calculate Price of Condo with HOA Fees 
	 * @param newCondo set condo
	 * @return Total price with HOA fees 
	 */
	private double calculateTotalPriceOfCondoWithHOAFee(Condo newCondo) {
		return newCondo.getListingPrice() + (newCondo.getListingPrice() * HOA_PERCENT);
	}
	
	/**
	 * Method to get the Monthly Mortgage 
	 * @return Monthly Mortgage 
	 */
	public String getMonthlyMortgageForCondo() {
		return "Monthly cost: $" 
				+ String.format("%,4.2f", (this.calculateTotalPriceOfCondoWithHOAFee(this.condoThree) / 180)) 
				+ ", over 180 months, for a total of: $" 
				+ String.format("%,4.2f", this.calculateTotalPriceOfCondoWithHOAFee(this.condoThree));
	}
	
	/**
	 * Method to calculate avg cost of condos
	 * @return average cost 
	 */
	public String calculateAverageCostOfCondo() {
		this.average = (this.calculateTotalPriceOfCondoWithHOAFee(this.condoOne) 
				+ this.calculateTotalPriceOfCondoWithHOAFee(this.condoTwo)
				+ this.calculateTotalPriceOfCondoWithHOAFee(this.condoThree)
				+ this.calculateTotalPriceOfCondoWithHOAFee(this.condoFour)) / 4.0;
		return "Average cost of available condos: $" + String.format("%,4.2f", this.average);
	}
	
	/**
	 * Getter for buildingAddress
	 * @return the buildingAddress
	 */
	public String getBuildingAddress() {
		return this.buildingAddress;
	}
	
	/**
	 * Setter for buildingAddress
	 * @param buildingAddress to set buildingAddress
	 */
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}
	
	/**
	 * Getter for buildingName
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return this.buildingName;
	}
	
	/**
	 * Setter for buildingName
	 * @param buildingName to set buildingName
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	/**
	 * Getter for buildingAmenities
	 * @return the buildingAmenities
	 */
	public String getBuildingAmenities() {
		return this.buildingAmenities;
	}
	
	/**
	 * Setter for buildingAmenities
	 * @param buildingAmenities to set buildingAmenities
	 */
	public void setBuildingAmenities(String buildingAmenities) {
		this.buildingAmenities = buildingAmenities;
	}
	
	/**
	 * Getter for condoOne
	 * @return the condoOne
	 */
	public Condo getCondoOne() {
		return this.condoOne;
	}
	
	/**
	 * Setter for condoOne
	 * @param condoOne to set condoOne
	 */
	public void setCondoOne(Condo condoOne) {
		this.condoOne = condoOne;
	}
	
	/**
	 * Getter for condoTwo
	 * @return the condoTwo
	 */
	public Condo getCondoTwo() {
		return this.condoTwo;
	}
	
	/**
	 * Setter for condoTwo
	 * @param condoTwo to set condoTwo
	 */
	public void setCondoTwo(Condo condoTwo) {
		this.condoTwo = condoTwo;
	}
	
	/**
	 * Getter for condoThree
	 * @return the condoThree
	 */
	public Condo getCondoThree() {
		return this.condoThree;
	}
	
	/**
	 * Setter for condoThree
	 * @param condoThree to set condoThree
	 */
	public void setCondoThree(Condo condoThree) {
		this.condoThree = condoThree;
	}
	
	/**
	 * Getter for condoFour
	 * @return the condoFour
	 */
	public Condo getCondoFour() {
		return this.condoFour;
	}
	
	/**
	 * Setter for condoFour
	 * @param condoFour to set condoFour
	 */
	public void setCondoFour(Condo condoFour) {
		this.condoFour = condoFour;
	}
}
