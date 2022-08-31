public class Passenger {

    private String name;
    private int phoneNumber;
    private int passengerId;

    public Passenger (String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.passengerId = (int) (100*Math.random());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return passengerId;
    }

    public void setId() {
        this.passengerId = (int) (100*Math.random());
    }
    
    
}
