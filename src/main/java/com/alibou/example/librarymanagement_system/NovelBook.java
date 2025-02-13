package com.alibou.example.librarymanagement_system;

public class NovelBook extends Book{
    private String gendre;

    NovelBook(String isbn, String title,String author){
        super(isbn,  title, author);
        this.gendre = gendre;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("GENDRE: " + gendre);
    }
}
