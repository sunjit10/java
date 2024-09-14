package jmx.users;

// Managed resource "User"
public class User implements UserMBean {

    private Long id = 1234L;
    private String userName = "Jack";
    private String password = "secret";


    // These two methods below make "Operations" UI possible
    @Override
    public void printUserInfo() {
	System.out.println("This is user with username: " + userName);
    }

    @Override
    public String showDetails() {
	return "User " + userName + " Id " + id;
    }

    // These methods below make "Attributes" UI possible
    @Override
    public Long getId() {
	return id;
    }

    @Override
    public String getUserName() {
	return userName;
    }

    @Override
    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String getPassword() {
	return password;
    }
    
    
}
