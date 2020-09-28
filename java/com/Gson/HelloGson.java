package com.Gson;

import com.bean.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HelloGson {
    @Test
    public void test1(){
        Person person = new Person(1,22,"小明","男");
        Gson gson = new Gson();
        String personJSONStr = gson.toJson(person);
        Person p = gson.fromJson(personJSONStr, Person.class);
        System.out.println(p);
    }
    @Test
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(1,new Person(1,22,"张三","男"));
        Gson gson = new Gson();
        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);
        Map<Integer,Person> personMap1 = gson.fromJson(personMapJsonString,
                new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap1);
        Person p = personMap1.get(1);
        System.out.println(p);
    }


}
