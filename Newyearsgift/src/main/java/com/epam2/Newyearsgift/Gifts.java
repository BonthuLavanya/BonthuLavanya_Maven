package com.epam2.Newyearsgift;

public class Gifts{
    static double total_weight=0;
    static String name;
    static double weight;
    static double price;
	  Gifts(String name,double weight,double price)
	  {
		  Gifts.name=name;
		  Gifts.weight=weight;
		  Gifts.price=price;
		  total_weight+=weight;
    }
}
