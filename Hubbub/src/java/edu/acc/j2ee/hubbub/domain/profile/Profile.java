package edu.acc.j2ee.hubbub.domain.profile;

import edu.acc.j2ee.hubbub.domain.user.User;

public class Profile implements java.io.Serializable {
    private User   owner;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String biography;

    public Profile() {
    }
    
    public Profile(User owner) {
        this.owner = owner;
    }

    public Profile(User owner, String firstName, String lastName, 
            String emailAddress, String biography) {
        this.owner = owner;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.biography = biography;
    }
    
    public User getOwner() {
        return owner;
    }
    
    public void setOwner(User owner) {
        this.owner = owner;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
    
    @Override
    public String toString() {
        return String.format("Profile[%s]", owner);
    }
}
