package com.alibou.example.librarymanagement_system.webscrapper;

import java.util.concurrent.Callable;

public class ScrapperURL implements Callable<Void> {
    private String url;
    public ScrapperURL(String url) {
        this.url = url;
    }
    @Override
    public Void call() throws Exception {
      //  System.out.println("Scrapper URL: " + url);
        Thread.sleep(400);
        return null;
    }
}
