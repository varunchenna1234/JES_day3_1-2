package letsupgrade;
import java.util.*;

public class Day_3_2_Employee {
	String name;
	int dob,mob,byear,presentyear;
	long salary;
	public void display() {
		double tax = 0;
		//Using Switch Case
		/*switch(salary){
			case 500000:{
				tax=500000*0.2;
				break;
			}
			case 400000:{
				tax=400000*0.15;
				break;
			}
			case 300000:{
				tax=300000*0.1;
				break;
				
			}
			case 200000:{
				tax=200000*0.05;
				break;
			}
			
		}*/
		//Using if-else 
		if(salary>=500000) {
			tax=salary*0.2;
		}
		else if(salary>=400000 && salary<500000) {
			tax=salary*0.15;
		}
		else if(salary>=300000 && salary<300000) {
			tax=salary*0.1;
		}
		else{
			tax=salary*0.05;
		}
		int age=presentyear-byear;
		
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age+" years");
		System.out.println("Annual Salary is "+salary);
		System.out.println("Tax Amount is "+tax);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Day_3_2_Employee e=new Day_3_2_Employee();
		System.out.println("Enter the Name");
		e.name=in.nextLine();
		System.out.println("Enter the birth year");
		e.byear=in.nextInt();
		System.out.println("Enter the date of birth");
		e.dob=in.nextInt();
		System.out.println("Enter the Month of birth");
		e.mob=in.nextInt();
		System.out.println("Enter Salary per month");
		e.salary=in.nextLong();
		System.out.println("Enter present year");
		e.presentyear=in.nextInt();
		e.display();
		in.close();
	}
	

}
