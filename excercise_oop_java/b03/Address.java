package excercise_oop_java.b03;

public class Address {
    private String country;
    private String city;
    private String district;
    private String street;

    public Address() {
        
    }

    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String c) {
        this.country = c;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String c) {
        this.city = c;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String d) {
        this.district = d;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String s) {
        this.street = s;
    }

    public String toString() {
        return this.country + " - " + this.city + " - " + this.district + " - " + this.street; 
    }
}
