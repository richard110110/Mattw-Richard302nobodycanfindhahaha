package asgn2Pizzas;


import java.time.LocalTime;
import java.util.ArrayList;

import asgn2Exceptions.PizzaException;


/**
 * 
 *  A class that represents a vegetarian pizza made at the Pizza Palace restaurant. 
 *  The vegetarian pizza has certain toppings listed in Section 5.1 of the Assignment Specification Document.  
 *  A description of the class's fields and their constraints is provided in Section 5.1 of the Assignment Specification.
 * 
 * @author PersonA
 *
 */
public class VegetarianPizza extends Pizza {

	/**
	 * 
	 *  This class represents a vegetarian pizza made at the  Pizza Palace restaurant. The vegetarian pizza has certain
	 *  toppings listed in Section 5.1 of the Assignment Specification Document.  A description of the class's
	 *  fields and their constraints is provided in Section 5.1 of the Assignment Specification.
	 *  A PizzaException is thrown if the any of the constraints listed in Section 5.1 of the Assignment Specification are violated. 
	 * 
     * <P> PRE: TRUE
	 * <P> POST: All field values including the cost per pizza are set
	 * @param quantity - The number of pizzas ordered 
	 * @param orderTime - The time that the pizza order was made and sent to the kitchen 
	 * @param deliveryTime - The time that the pizza was delivered to the customer
	 * @throws PizzaException if supplied parameters are invalid 
	 *
	 */
	public VegetarianPizza(int quantity, LocalTime orderTime, LocalTime deliveryTime) throws PizzaException {
		// TO DO
		//super(quantity, orderTime, deliveryTime, Type, price)
		
		super(quantity, orderTime, deliveryTime, "Vegetarian", 10.00);
		toppings = new ArrayList<PizzaTopping>();		
		toppings.add(PizzaTopping.TOMATO);
		toppings.add(PizzaTopping.CHEESE);
		toppings.add(PizzaTopping.EGGPLANT);
		toppings.add(PizzaTopping.MUSHROOM);
		toppings.add(PizzaTopping.CAPSICUM);
		calculateCostPerPizza();
		
		// how constructor fit in the throw exception
		if (quantity >0 && quantity <=10){
		} else {
			throw new PizzaException("Quantity of the pizza should be at least one and at most 10");
		}
	//	super.calculateCostPerPizza();
	}

}
