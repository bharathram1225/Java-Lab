package myproject;
import java.util.*;



public class Student {
	String name, address, emailid, branch, phonenumner;
	double t_fees, fees1;
	double total_fees = 0;
	
	static double ad_fees;
	static double tution_fees;
	
	static {
		ad_fees=12000;
		tution_fees=30000;
	}
	
	
	Student(String name,String address,String phonenumner) {
		
		this.name = name;
		this.address = address;
		this.phonenumner = phonenumner;			
	}
	
	void Display() {
		System.out.println("The Student name is: "+this.name);
		System.out.println("The Student address is: "+this.address);
		System.out.println("The Student phonenumner is: "+this.phonenumner);
	}
	
	Student(String emailid, String branch) {
		
		this.emailid = emailid;
		this.branch = branch;
			
	
	}
	
	 void Display(String emailid) {
	
		System.out.println("The Student emailid is: "+this.emailid);
		System.out.println("The Student branch is: "+this.branch);
		System.out.println("The Student ad_fees is: "+ad_fees);
		System.out.println("The Student tution_fees is: "+tution_fees);
		this.fees_cal();
		
		
	}
	
	 void fees_cal() {
		 
		 switch (this.branch) {
		case "mca":
			this.t_fees=2390;
			this.fees1=1230;		
			break;
		case "mtech":
			this.t_fees=2390;
			this.fees1=1230;		
			break;
		case "eee":
			this.t_fees=2390;
			this.fees1=1230;		
			break;
		case "cs":
			this.t_fees=2390;
			this.fees1=1230;		
			break;
		case "civil":
			this.t_fees=2390;
			this.fees1=1230;		
			break;

		default:
			System.out.println("Invalid branch");
		}
		 this.total_fees =this.ad_fees+this.tution_fees+this.t_fees+this.fees1;
		 
		 System.out.println("the total fees for "+this.branch+" is : "+this.total_fees);
		 
		
		
		
		
	}
	 
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Student: ");
		String name = sc.nextLine();
		System.out.println("Enter the Address of the Student: ");
		String address = sc.nextLine();
		System.out.println("Enter the phone number of the Student: ");
		String phonenumber = sc.next();
		System.out.println("Enter the Email id of the Student: ");
		String emailid = sc.next();
		System.out.println("Enter the branch of the Student: ");
		String branch = sc.next();
		
		Student s1 = new Student(name,address,phonenumber);
		Student s2 = new Student(emailid,branch);
		
		s1.Display();
		s2.Display(emailid);
		
		
		
	}

}
