/****************************************************************
 * Purpose : To create a contact information.
 * @author Samarth BM
 ***************************************************************/

package com.bridgelabs;


public class contactInfo {
    private String firstName, lastName, address, city, state, email;
    private long zip, phoneNumber;

    public String toString() {
        return " First name= " + firstName + " Last name= " + lastName + " Address= " + address + " City= " + city
                + " State= " + state + " Zip= " + zip + " Phone Number= " + phoneNumber + " E-mail= "  + email;
    }

    /* Generating setters and getters for class */

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
