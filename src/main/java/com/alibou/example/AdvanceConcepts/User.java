package com.alibou.example.AdvanceConcepts;

public abstract class User {
    private String userID;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;
    public abstract void returnBook();
    //Default constructor
    User() {
        userID = generateUserID();
    }

    //Param constructor
    User(String name, String contactInfo) {
        userID = generateUserID();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    //Copy constructor
    public User(User other) {
        this.userID = generateUserID();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    private final String generateUserID() {
        totalUsers++;
        return "User-" + totalUsers;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
