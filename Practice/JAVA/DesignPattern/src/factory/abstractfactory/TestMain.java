package factory.abstractfactory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import factory.abstractfactory.food.*;

/** Test for Abstract Factory
 * 
 * Abstract Factory:
 * 		Provides a way to encapsulate a group of individual factories that
 * 		have a common theme without specifying their concrete classes.
 * 		So the program can get different product from different factory as needed.
 * 
 * @author benbai123
 *
 */
public class TestMain {
	public static void main (String args[]) {
		// today
		Calendar cal = Calendar.getInstance();
		// all food
		List<Food> foodList = new ArrayList<Food>();

		for (int i = 0; i < 14; i++) {
			// get food
			foodList.add(FoodStore.getTodaysFood(cal));
			// increase date
			cal.add(Calendar.DATE, 1);
		}
		// show all food
		System.out.println("Food for next 14 days:");
		for (Food f : foodList) {
			System.out.println(f.getDesc());
		}
	}
}
