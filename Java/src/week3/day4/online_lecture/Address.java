package week3.day4.online_lecture;

public class Address {

    private String line1;
    private String city;
    private String zip;

    //creation

    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString(){
        return line1 + " " + city + " " +zip;
    }

    public String getLine1() {
        return line1;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}
