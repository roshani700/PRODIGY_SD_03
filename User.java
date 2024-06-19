package PRODIGY_SD_03;
import  java.util.ArrayList;
public class User {




      int id;
      String name;
      String email;
      long phone_no;
      ArrayList<User> users =new ArrayList<User>();

    public User() {
    
    }

    public User(int id,String name, String email, long phone_no) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "ID : "+id+", Name : "+name+", Phone Number : "+phone_no+", Email Address : "+email;
    }
    


    public  void createUser(User u){
         users.add(u);
        System.out.println("User Created.......");
    }

    
    public ArrayList<User> displayUser() {
    	return users;
    }
    
    public int updateUserName(int id,String name) {
    	for(User user: users) {
    		if(id==user.id) {
    			user.name=name;
    			return 1;
    		}
    	}
    	return 0;
    }
    
    public int deleteUser(int id) {
    	for(User user: users) {
    		if(id==user.id) {
    			users.remove(user);
    			return 1;
    		}
    	}
    	return 0;
    }
}
