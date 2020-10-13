///1st QUESTION
CODE:


package letsupgrade;
import java.util.*;
public class Day3_1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		double percentage;
		System.out.println("Enter the marks of five subjects");
		s1=in.nextInt();
		s2=in.nextInt();
		s3=in.nextInt();
		s4=in.nextInt();
		s5=in.nextInt();
		percentage=(s1+s2+s3+s4+s5)/5;
		System.out.println("Your Grade and percentage is");
		if(percentage>=90 && percentage<=100) {
			System.out.println("S Grade "+percentage+"%");
		}
		else if(percentage>=80 && percentage<90) {
			System.out.println("A Grade "+percentage+"%");
		}
		else if(percentage>=70 && percentage<80) {
			System.out.println("B Grade "+percentage+"%");
		}
		else if(percentage>=60 && percentage<70) {
			System.out.println("C Grade "+percentage+"%");
		}
		else if(percentage>=50 && percentage<60) {
			System.out.println("D Grade "+percentage+"%");
		}
		else if(percentage<50) {
			System.out.println("F-Failed "+percentage+"%");
		}
		else {
			System.out.println("Enter marks properly "+percentage+"%");
		}
		in.close();
	}

}


///////2nd QUESTION
CODE:

  
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
