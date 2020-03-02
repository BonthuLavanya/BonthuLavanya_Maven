package com.epam2.Newyearsgift;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App  
{
  private static ArrayList<String> getcandiesingivenrange(double ll,double hl,int sort_type)
  {
    HashMap<String, Double> candyprice= Candies.getcandyprice();
    HashMap<String, Double> candyweight = Candies.getcandyweight();
    ArrayList<String>l=new ArrayList<String>();
    if(sort_type==1)
    {
      for(Map.Entry <String,Double> v:candyprice.entrySet())
      {
        if(v.getValue()>=ll && v.getValue()<=hl)
        {
          l.add(v.getKey());
        }
      }
    }
    else
    {
      for(Map.Entry <String,Double> v:candyweight.entrySet())
      {
        if(v.getValue()>=ll && v.getValue()<=hl)
        {
          l.add(v.getKey());
        }
      }
    }
    return l;
  }
  public static HashMap<String, Double> sortByValue(HashMap<String, Double>hm) 
    { 
      List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double> >(hm.entrySet()); 
      Collections.sort(list, new Comparator<Map.Entry<String, Double> >()
      { 
        public int compare(Map.Entry<String, Double> o1,  Map.Entry<String, Double> o2) 
        { 
          return (o1.getValue()).compareTo(o2.getValue()); 
        } 
      });  
      HashMap<String, Double> temp = new LinkedHashMap<String, Double>(); 
      for (Map.Entry<String, Double> aa : list)
      { 
        temp.put(aa.getKey(), aa.getValue()); 
      } 
      return temp; 
    } 
  private static void accessinghashmap(int sort_type)
  {
    HashMap<String, Double> w = Choclates.getw();
    HashMap<String, Double> p = Choclates.getp();
    if(sort_type==1)
    {
      HashMap<String, Double> hm1 = sortByValue(p);
      System.out.println("The Sorted Result of choclates is :");
      for(Map.Entry <String,Double> val:hm1 .entrySet())
      {
        System.out.println(val.getKey());
      }
    }
    else
    {
      HashMap<String, Double> hm2 = sortByValue(w);
      System.out.println("The Sorted Result of choclates is according:");
      for(Map.Entry <String,Double> val:hm2.entrySet())
      {
        System.out.println(val.getKey());
      }
    }
  }
  public static void main( String[] args )
  {
   	Scanner obj = new Scanner(System.in);
    new Choclates("DairyMilk",50,75);
    new Choclates("Snickers",40,30);
    new Choclates("Mars",55,80);
    new Sweets("Rasgulla",1,210);
    new Sweets("GulabJamun",2,150);
    new Sweets("KajuKatli",1,725);
    new Candies("CandyBean",1.5,75);
    new Candies("MilkCandy",0.5,80);
    new Candies("CoconutCandy",2.5,100);
    System.out.println("The total weight of Gift is: "+Gifts.total_weight);
    System.out.println("Enter the way to sort(Enter a number) \n1-sort by price\n2-sort by weight:");
    int sort_type=obj.nextInt();
    accessinghashmap(sort_type);
    double ll,hl;
    if(sort_type==1)
    {
      System.out.println("Enter Lowerlimit of Price:");
      ll=obj.nextDouble();
      System.out.println("Enter Higherlimit of Price:");
      hl=obj.nextDouble();
    }
    else
    {
      System.out.println("Enter Lowerlimit of weight:");
      ll=obj.nextDouble();
      System.out.println("Enter Higherlimit of weight:");
      hl=obj.nextDouble();
    }
    ArrayList<String>l=getcandiesingivenrange(ll,hl,sort_type);
    System.out.println("The Candies in predefined range are:");
    System.out.println(l.size());
    for(int i=0;i<l.size();i++)
    {
      System.out.println(l.get(i));
    }
    obj.close();
  }
}
