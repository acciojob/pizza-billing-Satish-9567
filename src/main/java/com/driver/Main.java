package com.driver;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    DeluxePizza dp = new DeluxePizza(true);
    //System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    System.out.println("Click y for PaperBag");
    str=sc.next();
    if(str.charAt(0)=='y'||str.charAt(0)=='Y')
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    System.out.println("Click y for ExtraCheese ");
    str=sc.next();
    if(str.charAt(0)=='y'||str.charAt(0)=='Y')
    p.addExtraCheese();
    System.out.println("Click y for ExtraToppings");
    str=sc.next();
    if(str.charAt(0)=='y'||str.charAt(0)=='Y')
    p.addExtraToppings();
    System.out.println("Click y for PaperBag");
    str=sc.next();
    if(str.charAt(0)=='y'||str.charAt(0)=='Y')
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}
