package restoFinalRework;

import java.util.Scanner;
import java.util.Random;

public class FoodOrderSub {
	Scanner s = new Scanner(System.in);
	Random rand = new Random();
	int dineLoc;
	int payChoice;
	int mainMenu;
	int quantity;
    int total;
    //String order = "";
	
	public void head() {
		
		System.out.println("======================== LycDonalds ============================");
		System.out.println();
		enter();
	}
	
	public void enter(){
		 System.out.println("		   Welcome to LycDonalds!");
		 System.out.println();
		 System.out.println("================================================================");
		 System.out.println();
		 System.out.println("Please type the number of your choice.");
		 System.out.println();
		 
		 diningLocation();
		 
	}

	public void diningLocation() {
		System.out.println("Dining Location");
		System.out.println();
		System.out.println("(1) Dine-in");
		System.out.println("(2) Take-out");
		
		System.out.println();
		dineLoc = s.nextInt();
		System.out.println();
		
		switch(dineLoc) {
			case 1:
				System.out.println("Dine-in");
				System.out.println();
				payment();
				break;
			case 2:
				System.out.println("Take-out");
				System.out.println();
				payment();
				break;
			default:
				System.out.println("Invalid number, please try again");
				System.out.println();
				diningLocation();
				break;
		}
	}
	
	public void payment() {
		System.out.println("How would you like to pay?");
		System.out.println();
		System.out.println("(1) Cash");
		System.out.println("(2) Card");
		
		System.out.println();
		payChoice = s.nextInt();
		System.out.println();
		
		switch(payChoice) {
			case 1:
				System.out.println("Cash");
				menu();
				break;
			case 2:
				System.out.println("Card");
				menu();
				break;
				
			default:
				System.out.println("Invalid number, please try again");
				System.out.println();
				payment();
				break;
		}
	}
	
	public void menu() {
		System.out.println();
		System.out.println("Main Menu");
		System.out.println();
		System.out.println("(1) Combo Meals");
		System.out.println("(2) Burgers");
		System.out.println("(3) Fries and Add ons");
		System.out.println("(4) Beverages");
		System.out.println("(5) Pasta");
		
		System.out.println();
		mainMenu = s.nextInt();
		System.out.println();
		
		switch(mainMenu) {
			case 1: // Rice Meals
				riceMeals();
			
				break;
			case 2: // Burger meals
				burgerMeals();
				
				break;
			case 3: // Add on meals
				addonMeals();
				
				break;
			case 4: // Beverages
				beveragesMeals();
				
				break;
			case 5: // Pasta
				pastaMeals();
				
				break;
			default:
				System.out.println("Invalid number, please try again");
				menu();
				break;
		}
	}
	public void riceMeals() {
		int riceMealsMenu;
		int chickenMcdo = 200;
		int chickenMcNuggets = 150,ChickFillet = 150;
		int mushroomMeal = 100;
		
		System.out.println("(1) Chicken LycDonald - ₱200");
		System.out.println("(2) Chicken LycNuggets - ₱150");
		System.out.println("(3) Chicken Fillet Meal - ₱150");
		System.out.println("(4) Mushroom Pepper Steak Meal - ₱100");
		
		System.out.println();
		riceMealsMenu = s.nextInt();
		System.out.println();
		
		switch(riceMealsMenu) {
			case 1:
				System.out.println("Chicken LycDonald");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * chickenMcdo;
				System.out.println();
				System.out.println("What drinks do you want?");
				System.out.println();
				beveragesMeals();
				
				break;
			case 2:
				System.out.println("Chicken LycNuggets");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * chickenMcNuggets;
				System.out.println();
				System.out.println("What drinks do you want?");
				System.out.println();
				beveragesMeals();
				
				break;
			case 3:
				System.out.println("Chicken Fillet Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * mushroomMeal;
				System.out.println();
				System.out.println("What drinks do you want?");
				System.out.println();
				beveragesMeals();
				
				break;
			case 4:
				System.out.println("Mushroom Pepper Steak Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * chickenMcdo;
				System.out.println();
				System.out.println("What drinks do you want?");
				System.out.println();
				beveragesMeals();
				
				break;
			default:
				System.out.println("Invalid number, please try again");
				System.out.println();
				riceMeals();
				break;
		}
		
	}
	public void burgerMeals() {
		int burgerMealsMenu;
		int bigMac = 150;
		int mcCrispyMeal = 130;
		int mcSpicy = 100,doubleCheeseBurger = 100;
		int cheeseBurger = 70;
		
		System.out.println("(1) Big Mac Meal - ₱150");
		System.out.println("(2) LycCrispy Chicken Sandwich Meal - ₱130"); 
		System.out.println("(3) LycSpicy Meal - ₱100");
		System.out.println("(4) Double Cheeseburger Meal - ₱100");
		System.out.println("(5) Cheeseburger Meal - ₱70");
		
		System.out.println();
		burgerMealsMenu = s.nextInt();
		System.out.println();
		
		switch(burgerMealsMenu) {
			case 1:
				System.out.println("Big Mac Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * bigMac;
				orderMore();
				break;
			case 2:
				System.out.println("LycCrispy Chicken Sandwich Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * mcCrispyMeal;
				orderMore();
				break;
			case 3:
				System.out.println("LycSpicy Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * mcSpicy;
				orderMore();
				break;
			case 4:
				System.out.println("Double Cheeseburger Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * doubleCheeseBurger;
				orderMore();
				break;
			case 5:
				System.out.println("Cheeseburger Meal");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * cheeseBurger;
				orderMore();
				break;
			default:
				System.out.println("Invalid number, please try again");
				System.out.println();
				burgerMeals();
				break;
		}
	}
	public void addonMeals() {
		int addonMealsMenu;
		int shakeFriesBBQ = 70,shakeFriesCheese = 70;
		int fries = 50,creamyMS = 50,creamyGS = 50;
		
		System.out.println("(1) Shake Shake Fries BBQ - ₱70");
		System.out.println("(2) Shake Shake Fries Cheese - ₱70");
		System.out.println("(3) Fries - ₱50");
		System.out.println("(4) Creamy Mushroom Soup - ₱50");
		System.out.println("(5) Creamy Garlic Soup - ₱50");
		
		System.out.println();
		addonMealsMenu = s.nextInt();
		System.out.println();
		
		switch(addonMealsMenu) {
			case 1:
				System.out.println("Shake Shake Fries BBQ");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * shakeFriesBBQ;
				orderMore();
				break;
			case 2:
				System.out.println("Shake Shake Fries Cheese");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * shakeFriesCheese;
				orderMore();
				break;
			case 3:
				System.out.println("Fries");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * fries;
				orderMore();
				break;
			case 4:
				System.out.println("Creamy Mushroom Soup");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * creamyMS;
				orderMore();
				break;
			case 5:
				System.out.println("Creamy Garlic Soup");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * creamyGS;
				orderMore();
				break;
			default:
				System.out.println("Invalid number, please try again");
				System.out.println();
				addonMeals();
				break;
		}
		}
	public void beveragesMeals() {
		int beveragesMealsMenu;
		int mcFlurry = 50,mcFloat = 50;
		int sundae = 30,icedTea = 30,orangeJuice = 30,coke = 30,sprite = 30;
		
		System.out.println("(1) LycFlurry Oreo - ₱50"); 
		System.out.println("(2) LycFloat - ₱50");
		System.out.println("(3) Sundae - ₱30"); 
		System.out.println("(4) Iced Tea - ₱30"); 
		System.out.println("(5) Orange Juice - ₱30"); 
		System.out.println("(6) Coke - ₱30"); 
		System.out.println("(7) Sprite - ₱30");
		
		System.out.println();
		beveragesMealsMenu = s.nextInt();
		System.out.println();
		
		switch(beveragesMealsMenu) {
			case 1:
				System.out.println("LycFlurry Oreo");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * mcFlurry;
				sideToppings();
				break;
			case 2:
				System.out.println("LycFloat");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * mcFloat;
				sideToppings();
				break;
			case 3:
				System.out.println("Sundae");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * sundae;
				sideToppings();
				break;
			case 4:
				System.out.println("Iced Tea");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * icedTea;
				sideToppings();
				break;
			case 5:
				System.out.println("Orange Juice");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * orangeJuice;
				sideToppings();
				break;
			case 6:
				System.out.println("Coke");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * coke;
				sideToppings();
				break;
			case 7:
				System.out.println("Sprite");
				System.out.print("Quantity: ");
				quantity = s.nextInt();
				total = total + quantity * sprite;
				sideToppings();
				break;
			default:
				System.out.println("Invalid number, please try again");
				System.out.println();
				beveragesMeals();
				break;
		}
	}
	public void pastaMeals() {
		int pastaMealsMenu;
		int creamySpag = 100,ricottaCarb = 100;
		
		System.out.println("(1) Creamy Sweet Spaghetti - ₱100");
		System.out.println("(2) Ricotta Carbonara - ₱100");
		
		System.out.println();
		pastaMealsMenu = s.nextInt();
		System.out.println();
		
		switch(pastaMealsMenu) {
		case 1:
			System.out.println("Creamy Sweet Spaghetti");
			System.out.print("Quantity: ");
			quantity = s.nextInt();
			total = total + quantity * creamySpag;
			orderMore();
			break;
		case 2:
			System.out.println("Ricotta Carbonara");
			System.out.print("Quantity: ");
			quantity = s.nextInt();
			total = total + quantity * ricottaCarb;
			orderMore();
			break;
		default:
			System.out.println("Invalid number, please try again");
			System.out.println();
			pastaMeals();
			break;
		}
		
	}
	public void orderMore() {
		int orderMoreCH;
		System.out.println();
		System.out.println("Do you want to order more?");
		System.out.println();
		System.out.println("(1) - Yes");
		System.out.println("(2) - No");
		System.out.println();
		orderMoreCH = s.nextInt();
		switch(orderMoreCH) {
		case 1:
			menu();
			break;
		case 2:
			orderOrCancel();
			break;
		default:
			System.out.println("Invalid number, please try again");
			System.out.println();
			orderMore();
			break;
		
		}

		
	}
	public void sideToppings() {
		int sideToppingsch;
		System.out.println();
		System.out.println("Do you want add-on meals?");
		System.out.println();
		System.out.println("(1) - Yes");
		System.out.println("(2) - No");
		System.out.println();
		sideToppingsch = s.nextInt();
		switch(sideToppingsch) {
		case 1:
			addonMeals();
			break;
		case 2:
			orderMore();
			break;
		default:
			System.out.println("Invalid number, please try again");
			sideToppings();
			break;
		}
		
		
	}
	
	public void orderOrCancel() {
		int orderOrCancelChoice;
		System.out.println();
		System.out.println("Is this order correct?");
		System.out.println();
		System.out.println("(1) - Place order");
		System.out.println("(2) - Cancel");
		System.out.println();
		orderOrCancelChoice = s.nextInt();
		switch(orderOrCancelChoice) {
		case 1:
			System.out.println();
			System.out.println("Thanks for ordering!\nYou can bring the receipt to the counter! ");
			receipt();
			break;
		case 2:
			areuSure();
			break;
		default:
			System.out.println("Invalid number, please try again");
			orderOrCancel();
			break;
		}
	}
	public void areuSure() {
		int orderOrCancelChoiceCase;
		System.out.println();
		System.out.println("Are you sure to cancel the order?");
		System.out.println();
		System.out.println("(1) - Yes");
		System.out.println("(2) - No");
		System.out.println();
		orderOrCancelChoiceCase = s.nextInt();
		switch(orderOrCancelChoiceCase) {
		case 1:
			System.out.println();
			System.out.println("Order Canceled");
			System.out.println();
			head();
			break;
		case 2:
			orderOrCancel();
			break;
		default:
			System.out.println("Invalid number, please try again");
			areuSure();
			break;
		}
	}
	public void receipt() {
		System.out.println();
		System.out.println("======================== LycDonalds ============================");
		System.out.println();
		System.out.println("Dining Location: (1 - Dine in), (2 - Take out) : "+dineLoc);
		System.out.println("Payment Choice:  (1 - Cash   ), (2 - Card    ) : "+payChoice);
		System.out.println("Total: ₱" + total);
		System.out.println();
		int randomNum = rand.nextInt(101);
		System.out.println("Receipt number: " + randomNum);
		System.out.println();
		System.out.println("================================================================");
	}
	
	}

