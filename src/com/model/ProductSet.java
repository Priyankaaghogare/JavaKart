package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ProductSet {

	/**
	 * @param args
	 */
	public void main2() {

		Scanner sc = new Scanner(System.in);

		Product e1 = new Product();
		e1.setId(101);
		e1.setName("SmartPhone");
		e1.setDes("High-end smartphone with OLED display and 128GB storage,");
		e1.setRatings(4.5f);
		e1.setPrice(35000);

		Product e2 = new Product();
		e2.setId(102);
		e2.setName("Laptop");
		e2.setDes("15.6-inch laptop with Intel i7 processor and 16GB RAM");
		e2.setRatings(4.7f);
		e2.setPrice(75000);

		Product e3 = new Product();
		e3.setId(103);
		e3.setName("HeadPhones");
		e3.setDes("Wireless noise-canceling headphones with 30-hour battery life");
		e3.setRatings(4.6f);
		e3.setPrice(5000);

		Product e4 = new Product();
		e4.setId(104);
		e4.setName("SmartWatch");
		e4.setDes("Water-resistant smartwatch with heart rate monitor and GPS");
		e4.setRatings(4.8f);
		e4.setPrice(5000);

		Product e5 = new Product();
		e5.setId(105);
		e5.setName("Tablet");
		e5.setDes("10.5-inch tablet with 64GB storage and stylus support,");
		e5.setRatings(4.7f);
		e5.setPrice(65000);

		List<Product> pr = new ArrayList<>();
		pr.add(e1);
		pr.add(e2);
		pr.add(e3);
		pr.add(e4);
		pr.add(e5);

		Collections.sort(pr);

		for (Product p : pr) {
			System.out.println(p);
		}
		
		List<Integer> pro = new ArrayList<>();

		int amt = 0;

		while (true) {
			System.out.println("1.Add Product");
			System.out.println("2.Remove Product");
			System.out.println("3.View Kart");
			System.out.println("4.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter product Id");
				int id = sc.nextInt();
				pro.add(id);
				
				for (Product p : pr) {
				    if (p.getId() == id) {
				        amt += p.getPrice();
				    }
				}

				//System.out.println(pro);
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
				break;
			case 2:
				System.out.println("Enter product Id");
				int id1 = sc.nextInt();
				// pro.remove(id1) treats id1 as an Index
				pro.remove(Integer.valueOf(id1));
				for (Product p : pr) {
				    if (p.getId() == id1) {
				        amt -= p.getPrice();
				    }
				}
				//System.out.println(pro);
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
				break;
			case 3:
				System.out.println("View Your Products :" + pro);
				System.out.println("Final Amount :"+amt);
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
				break;
			case 4:
				System.out.println("Your Order Has Been Placed Successfully....");
				System.out.println("Thank You !!! Visit Again...");
				System.exit(0);
				break;
			}
		}
	}

}
