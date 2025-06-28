public class Customer {
    public String firstName;
    public String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void buy() {
        System.out.println("Customer " + this.firstName + " " + this.lastName + " has bought a car");
    }
}