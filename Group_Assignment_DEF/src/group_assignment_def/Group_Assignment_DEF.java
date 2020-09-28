/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_assignment_def;
    import java.text.DecimalFormat;
    import java.util.Scanner;

/**
 *
 * @author benig
 */
public class Group_Assignment_DEF {
public static DecimalFormat df=new DecimalFormat(".##");   //object of two decimal format
  public static void main(String[] args) { 
   Scanner cs=new Scanner(System.in);
   System.out.println("Enter Your Name");
      String name=cs.nextLine();			//taking the user name
      System.out.println("Number of Hour Worked in a month:");
      int hours=cs.nextInt();   			//taking the hours amount
      System.out.println("Hourly Pay Rate: ");
      float Pay=(float) cs.nextDouble();      		//taking the pay rate amount
      float Gross= (hours/4)*Pay; 			//calculate the Gross pay  
      float KWSP= Gross/100*15;			//calculate 15% of gross pay
      float Tax= Gross/100*7;			//calculate 7% of gross pay
      float Net= Gross-(KWSP+Tax);		//subtract total tax from gross amount
      System.out.println("Syarikat Timur Jauh Sdn. Bhd");
      System.out.println("Payment of October 2013");
      System.out.println("\n\tEmployee's Name:"+name); 
      System.out.println("\tNumber of hours worked in a week:"+hours/4+"hours");
      System.out.println("\tHourly Pay Rate:"+"RM"+Pay);
      System.out.println("\tGross Pay:"+"RM"+Gross);
      System.out.println("\tDeductions:");
      System.out.println("\t\tKWSP (15%):"+ "RM"+df.format(KWSP));  //print kwsp result in two decimal format
      System.out.println("\t\tIncome Tax (7%):"+"RM"+df.format(Tax));     //print tax result in two decimal format
      System.out.println("\t\tTotal Deduction:"+"RM"+df.format(KWSP+Tax));       //print in two decimal format
      System.out.println("Net Pay:"+"RM"+df.format(Net));	//print the net pay value in two decimal format
      }
}


