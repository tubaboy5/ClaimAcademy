package oldPrograms;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ValentinesDay 
{

	public static void main(String[] args) 
	{
		//variables
		String city_wide = "4 pack of City Wide";
        String chavas = "$15 Chavas Gift Card";
        String qt = "$15 QT gift card for some Dr. Pepper or Chicken Rods";
        String diet_coke = "2 liters of Diet Coke";
        String chips_salsa = "Chips and Salsa";
        String mcdonalds = "$10 gift card to McDonalds for some Chicken Nuggets";
        String the_girls = "$5 gift card to McDonalds for Chicken Nuggets for the girls";
        String nuggs = "$10 gift card to Chick-Fil-A for Chikn for everyone";
        
        LocalDate now = LocalDate.now();
        LocalDate firstDate = LocalDate.of(2012, 12, 12);
        
        //logic
        long days = ChronoUnit.DAYS.between(firstDate, now);
        long hours = days * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;
        
        //Output
        System.out.println("Happy Valentines Day Lindsay!");
        System.out.println();
        System.out.println("Do you know it's been " +days +" days since we first met on December 12, 2012?");
        System.out.println();
        System.out.println("That's " +hours +" hours, " +minutes +" minutes, and " +seconds +" seconds!");
        System.out.println();
        System.out.println("That's A LOT of love!  So I wanted to get you some cheesy things you love.");
        System.out.println("Like:");
        System.out.println("     " +city_wide);
        System.out.println("     " +chavas);
        System.out.println("     " +qt);
        System.out.println("     " +diet_coke);
        System.out.println("     " +chips_salsa);
        System.out.println("     " +mcdonalds);
        System.out.println("     " +the_girls);
        System.out.println("     " +nuggs);
	}
}
