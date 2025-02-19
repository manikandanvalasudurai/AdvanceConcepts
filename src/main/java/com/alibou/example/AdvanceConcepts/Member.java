package com.alibou.example.AdvanceConcepts;

public class Member extends User{
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    Member(){
        super();
        borrowedBooksCount = 0;
    }

    Member(String name,String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Datas --> " + "User ID" + getUserID() + "name " + getName() +"contactInfo "+ getContactInfo());
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }
}
