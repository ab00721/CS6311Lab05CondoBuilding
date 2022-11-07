package edu.westga.cs6311.main;

import edu.westga.cs6311.condo.Condo;
import edu.westga.cs6311.condobuilding.CondoBuilding;

/**
 * Main class to call info from Condo and CondoBuilding
 * @author Anna Blood
 * @version 09/16/22
 *
 */
public class Main {

	/**Application entry point
	 * @param args Not used 
	 */
	public static void main(String[] args) {
		Condo myFirstCondo = new Condo("12", 2, 2, 800, 115211.99, 67);
		CondoBuilding myCondoBuilding = new CondoBuilding("Starfish", "123 Beach Lane", "Indoor Plumbing");		
		
		System.out.println(myFirstCondo.getCondoInformation());
		System.out.println(myCondoBuilding.getBuildingInformation());
		
		System.out.print(myCondoBuilding.getAvailableCondoInfo());
		System.out.print("\n" + myCondoBuilding.getMonthlyMortgageForCondo());
		System.out.print("\n" + myCondoBuilding.calculateAverageCostOfCondo());
	}

}
