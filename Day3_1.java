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
