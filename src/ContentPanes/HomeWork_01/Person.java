package ContentPanes.HomeWork_01;

/**
 * Created by user on 9/3/2016.
 */
public class Person {
     private String givenName;
     private String surName;
     private String city;
     private int zip;

    Person(String givenname,String surname,String city,int zip){
        this.givenName = givenname;
        this.surName= surname;
        this.city= city;
        this.zip=zip;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
