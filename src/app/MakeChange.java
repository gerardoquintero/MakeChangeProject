package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double price = 0;
		double tendered = 0;
		System.out.println("How much is the price");

		price = sc.nextDouble();
		sc.nextLine();

		System.out.println("How much money was tendered by the Customer? ");
		tendered = sc.nextDouble();
		sc.nextLine();

		moneyProvided(price, tendered);

	}

	public static void moneyProvided(double cost, double cash) {

		int twenty = 0;
		int ten = 0;
		int five = 0;
		int dollar = 0;

		double change = 0;

		double quarter = 0;
		double dime = 0;
		double nickel = 0;
		double penny = 0;

		double temp;

		change = cash - cost;
		System.out.print("Amount: " + cost + ", Tendered: " + cash + ", ");

		if (cash < cost) {
			System.out.println("Result: Not enough money! ");

		} else if (cash == cost) {
			System.out.println("Result: No change! ");
		} else if (cash > cost) {

			System.out.print("Result: ");
			if (change / 20 >= 1) {
				temp = change / 20;
				twenty = (int) temp;
				change = Math.round(change * 100.0) / 100.0;
				change = change % 20;
				System.out.print(twenty + " twenty dollar bill(s), ");
			}
			if (change / 10 >= 1) {
				temp = change / 10;
				ten = (int) temp;
				change = Math.round(change * 100.0) / 100.0;
				change = change % 10;
				System.out.print(ten + " ten dollar bill(s), ");

			}

			if (change / 5 >= 1) {
				temp = change / 5;
				five = (int) temp;
				change = Math.round(change * 100.0) / 100.0;
				change = change % 5;
				System.out.print(five + " five dollar bill(s), ");

			}
			if (change / 1 >= 1) {
				temp = change / 1;
				dollar = (int) temp;
				change = Math.round(change * 100.0) / 100.0;
				change = change % 1;
				System.out.print(dollar + " one dollar bill(s), ");

			}
			if (change / 0.25 >= 0.25) {
				temp = change / 0.25;
				quarter = (int) temp;
				
				change = change % 0.25;
				if (quarter > 0) {
					System.out.print((int)Math.round(quarter) + " quarter(s), ");
				}
				

			}
			if (change / 0.10 >= 0.10) {
				temp = change / 0.10;
				dime = (int) temp;
				
				change = change % 0.10;
				if (dime > 0) {
					System.out.print((int)Math.round(dime) + " dime(s), ");
				}

			}
			if (change / 0.05 >= 0.05) {
				temp = change / 0.05;
				nickel = (int) temp;
				
				change = change % 0.05;
				if (nickel > 0) {
					System.out.print((int)Math.round(nickel) + " nickel(s), ");
				}
				

			}
			if (change / 0.01 >= 0.01) {
				temp = change / 0.01;
				penny = temp;
				
				change = change % 0.01;
				if (penny > 0) {
					System.out.print((int)Math.round(penny) + " penny(ies). ");
				}
				

			}

		}
	}
}
