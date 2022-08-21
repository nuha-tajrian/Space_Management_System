
package controller;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String phNum;
    private String ssn;
    private SpaceFlight spaceFlightBooked;
    private String seatBooked;
    

    public String getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(String seatBooked) {
        this.seatBooked = seatBooked;
    }

    public SpaceFlight getSpaceFlightBooked() {
        return spaceFlightBooked;
    }

    public void setSpaceFlightBooked(SpaceFlight spaceFlightBooked) {
        this.spaceFlightBooked = spaceFlightBooked;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }
    
}
