package com.alibou.example.AdvanceConcepts.LambdasStreamsExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClient {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        Stream<Integer> stream = list.stream();

//        List<Integer> ans =  stream.filter((data) -> {return data % 2 == 0;})
//                .collect(Collectors.toList());

//        Optional<Integer> ans = stream.filter(data ->{
//                      System.out.println("Filtering data : " + data);
//                        return data % 2 == 0; }).map((data) -> {
//                    System.out.println("Mapping data : " + data);
//                    return data * data;}).
//                findFirst();
//        System.out.println(ans);

         List<Integer> ques = List.of(1, 2, 3, 4, 5);
          List<Integer> quesans = ques.stream().
                  filter(x -> x > 2).
                  map(x -> x * 2).
                  collect(Collectors.toList());
          System.out.println(quesans);

    }
}
