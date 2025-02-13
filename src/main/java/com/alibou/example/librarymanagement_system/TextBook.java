package com.alibou.example.librarymanagement_system;

public class TextBook extends Book{
    private String subject;
    private int edition;

    TextBook(String isbn,String title, String author, int edition, String subject) {
        super(isbn , title, author);
        this.edition = edition;
        this.subject = subject;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Subject : " + subject);
        System.out.println("Edition : " + edition);
    }
}
