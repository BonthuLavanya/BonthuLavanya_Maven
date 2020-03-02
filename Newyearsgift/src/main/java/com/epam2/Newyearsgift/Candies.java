package com.epam2.Newyearsgift;

import java.util.HashMap;
public class Candies extends Gifts{
  static HashMap<String,Double>candyprice=new HashMap<String,Double>();
  static HashMap<String,Double>candyweight=new HashMap<String,Double>();
	Candies(String name,double weight,double price)
	{
		super(name,weight,price);
    candyprice.put(name,price);
    candyweight.put(name,weight);
	}
  public static HashMap<String,Double> getcandyprice() 
  {
    return candyprice;
  }
  public static HashMap<String,Double> getcandyweight() 
  {
    return candyweight;
  }
	
}