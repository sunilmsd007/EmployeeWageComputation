package employeeWage;
import java.util.Scanner;

public class CalculateEmpWage {

	 public static final int IS_PART_TIME = 1;
	 public static final int IS_FULL_TIME = 2;
	 
	 public static void calculateEmpWage(String companyName,int WagePerHr, int MaxDays, int MaxHrs) {
	
		 int empHrs=0,empWage=0,totalEmpHrs=0,totalEmployeewage=0,totalWorkingDays=0;

		 while (totalEmpHrs < MaxHrs && totalWorkingDays < MaxDays ) {
			 totalWorkingDays++;
			 int empCheck = (int) Math.floor(Math.random() * 10)% 3;
			 switch(empCheck) {
			    case IS_PART_TIME:
			    empHrs = 4;
			    break;
			    case IS_FULL_TIME:
				    empHrs = 8;
				    break;
				default:
					empHrs=0;
			 }
		 
		 totalEmpHrs += empHrs;
		 empWage = empHrs * WagePerHr;
		 totalEmployeewage += empWage;
	    } 
		 System.out.println("-----" +companyName+ "------");
		 System.out.println("Total Employee WorkingDays is: " + totalWorkingDays);
		 System.out.println("Total Employee WorkingHour is: " + totalEmpHrs);
		 System.out.println("Total Employee Wage is: " + totalEmployeewage);
	 }
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter company name");
		 String companyName=sc.nextLine();
		 System.out.println("enter employee wage per hour");
		 int empWagePerHour=sc.nextInt();
		 System.out.println("enter Maximum working days");
		 int maxWorkingDays=sc.nextInt();
		 System.out.println("enter maximum working hours");
		 int maxWorkingHour=sc.nextInt();
		 calculateEmpWage(companyName,empWagePerHour,maxWorkingDays,maxWorkingHour);
	 }

}

