package PRODIGY_SD_03;
import java.util.ArrayList;
import  java.util.Scanner;
public class Driver {
	
	
	    public static void main(String[] args) {
	    	char userchoice;
	        User user=new User();
	         Scanner sc = new Scanner(System.in);

	        do { 
	            System.out.println("User Management System");
	            System.out.println("1.Create user");
	            System.out.println("2.Display user Details");
	            System.out.println("3.Update user Details");
	            System.out.println("4.Delete user");
	            System.out.println("5.Exit");
	            System.out.println("Enter your choice");
	            int choice = sc.nextInt();
	             switch (choice) {
	                case 1:{
	                    System.out.println("Enter id : ");
	                     int id =sc.nextInt();
	                   
	                     System.out.println("Enter Name : ");
	                     String name = sc.next();
	                    
	                     System.out.println("Enter Email :");
	                     String email = sc.next();
	                    
	                     System.out.println("Enter Phone Number : ");
	                     long phone = sc.nextLong();
	                     User u = new User(id,name,email,phone);
	                     user.createUser(u);

	                }break;
	                
	                case 2: {
	                	ArrayList<User> users=new ArrayList<User>();
	                	users=user.displayUser();
	                	for(User user2 : users )
	                		System.out.println(user2);
	                	
	                  
	                }break;
	                
	                case 3:{
	                	System.out.print("Enter id to update: ");
	                	int id=sc.nextInt();
	                	System.out.print("Enter new Name :");
	                	String name=sc.next();
	                	int val=user.updateUserName(id, name);
	                	if(val==1)
	                		System.out.println("Name Updated Successfully....");
	                	else
	                		System.out.println("Given id not Found!!");
	                }break;
	                
	                case 4:{
	                	System.out.print("Enter id to delete : ");
	                	int id=sc.nextInt();
	                	int val=user.deleteUser(id);
	                	if(val==1)
	                		System.out.println("User Deleted Successfully....");
	                	else
	                		System.out.println("Given id not Found!!");
	                   
	                }break;
	                
	                case 5:{
	                    System.exit(1);
	                }break;
	                default:
	                    System.out.println("Invalid Option");
	            }
	             System.out.println("Enter Y/y to continue Otherwise press any key to Exit");
	             userchoice= sc.next().charAt(0);

	        } while (userchoice=='y' || userchoice=='Y');
	        System.out.println("You Exit From the Application");
	    }
	

}
