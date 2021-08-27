/**
 * 
 */
package emailadminpac;

import java.util.Random;
import java.util.Scanner;
public class EmailAdminBackend {
	//instance variable
	String emp_FirstName;
	String emp_LastName;
	String emp_Password;
	String emp_Mailboxcapacity;
	int emp_Department;
	//scanner class
	Scanner sc=new Scanner(System.in);
	
public void home_page(){	
	do{
		 System.out.println("Enter \n*register\n*exit");
		   String input = sc.next();
		    if (input.equals("register"))
		    {
		    	System.out.println("HELLO!!!!");
		    	emp_Name_Creation();
		    	System.out.println("----------------------------------------------------------------------------------------------------");
		    	System.out.println(generate_Random_Password(8));
		    	System.out.println("----------------------------------------------------------------------------------------------------");
		    	set_Userpassword();
		    	empDepartment();
		    	get_Mailboxcapacity() ;
		    	view_Emp_Details();
		    }
	     else if (input.equals("exit"))
	    {
	       System.out.println("thankyou visit again");
	    }
	   		    else
	    {
	        System.out.println("invalid input, tell them to try again");
	        continue;

	    } break;

	    
	} while (true);

}
public void emp_Name_Creation(){
    System.out.println("**************************************************************************");
	System.out.println("         WELCOME TO EMAIL ADMINISTRATION         ");
	System.out.println("**************************************************************************");
	//to ask the user firstname 
	System.out.println("enter the firstname of employee: ");
	emp_FirstName=sc.next();
	//to ask last name from user
	System.out.println("enter the last name of empoyee: ");
	emp_LastName=sc.next();
	System.out.println("Employee Name is: "+emp_FirstName+" "+emp_LastName);
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.println(emp_FirstName+" "+emp_LastName+" "+"Your Name Registered Successfully!!!....In EMAIL ADMINISTRATION");
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.println("\n");
	}
	public  char[] generate_Random_Password(int length){
		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase="abcdefghijklmnopqrstuvwxyz";
		String numbers="1234567890";
		String specialcharacter="!@#$%&*()><?.,";
		String combinationofcharacter=uppercase+lowercase+numbers+specialcharacter;
		Random random=new Random();
		char[] password=new char[length];
		for(int i=0;i<length;i++){
			password[i]=combinationofcharacter.charAt(random.nextInt(combinationofcharacter.length()));
			}
		System.out.println("Your System Generated Password Is: ");
		return password;
		}
	private void set_Userpassword(){
		String option;
		while(true){
		System.out.println("You Need To Change Your Password For Security Purpose Say Yes are No: ");
		option=sc.next();
		if(option.equals("yes")){
			System.out.println("Enter Your Password: ");
			emp_Password=sc.next();
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("Your Password Is: "+emp_Password );
			System.out.println("-------------------------------------------------------------------------------------------");
			break;
		}}
	}
	public void empDepartment(){
		System.out.println("your available departments are:\n*1.DEVELOPMENT\n*2.TESTING\n*3.MAINTANANCE\n*4.TEAMLEAD");
		System.out.println("enter your department: ");
		do{
			emp_Department=sc.nextInt();
			switch(emp_Department){
			case 1:System.out.println("You are  department is: Development");break;
			case 2:System.out.println("Your  department is: Testing");break;
			case 3:System.out.println("Your  department is: Maintanance");break;
			case 4:System.out.println("Your department is: Teamlead");break;
			default:System.out.println("wrong input");break;
			}
			
		}while(emp_Department>4);
		}
	public void get_Mailboxcapacity() {
		System.out.println("*************************************************************************************************");
		System.out.println("              MAILBOXCAPACITY             ");
		System.out.println("*************************************************************************************************");
		System.out.println("enter your mailboxcapacity: ");
		emp_Mailboxcapacity=sc.next();
		System.out.println("your mailboxcapacity is: "+emp_Mailboxcapacity);
	System.out.println("*************************************************************************************************");}
	public void view_Emp_Details(){
		String value;
		System.out.println("you want to view your portal: ");
		value=sc.next();
		if(value.equals("yes")){
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("                           TO VIEW EMPLOYEE DETAILS                                            ");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("employeename name is: "+emp_FirstName.toUpperCase()+" "+emp_LastName.toUpperCase());
		if(emp_Department==1){
			System.out.println("Employee  Department Is: Development");}
		else if(emp_Department==2){System.out.println("Employee  Department Is: Testing");}
		else if(emp_Department==3){System.out.println("Employee  Department Is: Maintanance");}
		else if(emp_Department==4){System.out.println("Employee  Department Is: Teamlead");}
		System.out.println("Employee Email Is: "+emp_FirstName.toLowerCase()+emp_LastName.toLowerCase()+"@edubridgeindia.com");
		System.out.println("Employee Password Is: "+emp_Password);
		System.out.println("Employee Mailcapacity Is: "+emp_Mailboxcapacity+"mbs");
		System.out.println("----------------------------------------------------------------------------------------------------");}
		else if(value.equals("no")){
		
		
			System.out.println("--------------------------------thakyou visit again------------------------------------");
		}
	}

public static void main(String[] args) {
		EmailAdminBackend emailadminbackend=new EmailAdminBackend();
		emailadminbackend.home_page();
		System.out.println("---------------------------YOUR DETAILS HAS BEEN REGISTERED SUCCESSFULLY!!!---------------------------------");		

}
}
