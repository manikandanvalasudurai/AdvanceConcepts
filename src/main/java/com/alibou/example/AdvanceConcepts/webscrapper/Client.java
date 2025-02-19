package com.alibou.example.AdvanceConcepts.webscrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> urls = new ArrayList<String>();

        for(int i=0;i<100;i++){
            urls.add("http://www.example.com/page" + i);
        }
        ExecutorService es1 = Executors.newFixedThreadPool(10);
        ExecutorService es2 = Executors.newCachedThreadPool();

        long start = System.currentTimeMillis();
        executeWebScrapping(urls,es1); // fixed
        long end = System.currentTimeMillis();
        System.out.println("Fixed Thread pool time to Scrap urls -->   "  + (end-start));

        start = System.currentTimeMillis();
        executeWebScrapping(urls,es2); // fixed
        end = System.currentTimeMillis();
        System.out.println("Cached Thread pool time to Scrap urls -->   "  + (end-start));

    }
    public static void executeWebScrapping(List<String> urls,ExecutorService es) throws ExecutionException, InterruptedException {
        List<Future<Void>> futures = new ArrayList<>();
        for(int i=0;i<urls.size();i++){
            futures.add(es.submit(new ScrapperURL(urls.get(i))));
        }
        for(Future<Void> future : futures){
            future.get(); //waiting
        }
        return;
    }
}
