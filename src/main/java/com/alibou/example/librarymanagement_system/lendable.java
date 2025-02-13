package com.alibou.example.librarymanagement_system;

import java.awt.print.Book;

public interface lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
