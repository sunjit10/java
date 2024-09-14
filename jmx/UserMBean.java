package jmx;

// MBean interface that lists all exposed Attributes and Operations
public interface UserMBean {

    
    // These two methods below make "Operations" UI possible
    // Make sure they don't start with get/set
    public void printUserInfo(); 
    public String showDetails();

    // These get/set methods is what makes "Attributes" UI possible
    public Long getId();
    public String getUserName();
    public String getPassword();
    public void setPassword(String password);
    
}
