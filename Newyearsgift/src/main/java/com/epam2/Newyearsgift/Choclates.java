package com.epam2.Newyearsgift;

import java.util.HashMap;
public class Choclates extends Gifts{
  static HashMap<String,Double>w=new HashMap<String,Double>();
  static HashMap<String,Double>p=new HashMap<String,Double>();
	Choclates(String name,double weight,double price)
	{
		super(name,weight,price);
    w.put(name,weight);
    p.put(name,price);
	}
  public static HashMap<String,Double> getw() 
  {
    return w;
  }
  public static HashMap<String,Double> getp() 
  {
    return p;
  }
	
}
