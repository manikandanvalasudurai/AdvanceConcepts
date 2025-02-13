package com.alibou.example.librarymanagement_system;

public class librarian extends User{
    private final String emplyoeeNumber;

    librarian(String emplyoeeNumber,String name, String contactInfo){
        super(name,contactInfo);
        this.emplyoeeNumber = emplyoeeNumber;
    }

    @Override
    public void returnBook() {

    }

    @Override
    public void displayDashboard() {
        System.out.println("librarian Datas --> " + "User ID" + getUserID() + "name " + getName() +"contactInfo "+ getContactInfo()+ "emplyoeeNumber "+ emplyoeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addBook(Book book){
        System.out.println("Add Book");
    }
    public void removeBook(Book book){
        System.out.println("Remove Book");
    }
}
