package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return list -> {
            for (String element : list) {
                if (!Character.isUpperCase(element.charAt(0))) {
                    return false;
                }
            }
            return true;
        };
    }



    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return list-> {
          for(Integer i : list){
              if(i % 2 == 0){
                  list.add(i);
              }
          }
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
          List<String> stringList = new ArrayList<>();
          for(String s: values){
              if(Character.isUpperCase(s.charAt(0)) && s.endsWith(".") && (s.split(" ").length > 3)){
                stringList.add(s);
              }
          }
          return stringList;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return list -> {
            Map<String, Integer> hashMap = new HashMap<>();
            for(String element : list){
                hashMap.put(element, element.length());
            }
            return hashMap;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> resList = new ArrayList<>(list1);
            resList.addAll(list2);
            return resList;
        };
    }
}
