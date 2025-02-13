package com.alibou.example.librarymanagement_system;

public abstract class Book implements lendable{
    private  String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String isbn, String title, String author){
        isAvailable = true;
    }

    Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
         isAvailable = true;
         user.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    public abstract void displayBookDetails();
}
