package utilities;

import java.time.Year;
import java.util.Random;

public class RegisterUserDto {
    private String name;
    private String emailAddress;
    private String password;
    private int day;
    private String month;
    private int year;
    private String firstName;
    private String lastName;
    private String companyName;
    private String addressOne;
    private String addressTwo;
    private int countryIndex;
    private String state;
    private String city;
    private int phoneNumber;
    private int zipCode;

    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
        return emailAddress;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getDay(){
        Random random = new Random();
        int day = random.nextInt(32);
        return day;
    }
    public String getMonth(){
        Random rand = new Random();
        int monthNum = rand.nextInt(12) + 1;
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        String randomMonth = months[monthNum - 1];
        return randomMonth;
    }
    public int getYear(){
        Random random = new Random();
        int currentYear = Year.now().getValue();
        int year = random.nextInt(currentYear - 1990 + 1) + 1990;
        return year;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public String getAddressOne(){
        return addressOne;
    }
    public void setAddressOne(String addressOne){
        this.addressOne=addressOne;
    }
    public String getAddressTwo(){
        return addressTwo;
    }
    public void setAddressTwo(String addressTwo){
        this.addressTwo=addressTwo;
    }
    public String getCountry(){
        Random rand = new Random();
        int index = rand.nextInt(7) + 1;
        String[] countries = {"India", "United States", "Canada", "Australia", "Israel", "New Zealand","Singapore",
                };
        String country = countries[index - 1];
        return country;

    }
    public void setCountryIndex(int countryIndex){
        this.countryIndex=countryIndex;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber= Integer.parseInt(phoneNumber);
    }
    public int getZipCode(){
        return zipCode;
    }
    public void setZipCode(String zipCode){
        this.zipCode= Integer.parseInt(zipCode);
    }
}

