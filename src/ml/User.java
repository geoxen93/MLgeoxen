
package ml;




public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private String rate;
    private int age;
    
    public User(int ID, String FirstName, String LastName, int Age , String Rate)
    {
        this.rate = Rate;
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getRate()
    {
        return rate;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
}





