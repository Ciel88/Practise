package com.ciel.demo;

import com.ciel.entity.Person;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

/**
 * @author 韦康 date 2021/7/10
 */
public class java8Demo1 {
    @Test
    public void test1() {
        List<Person> list = Arrays.asList(new Person("张三",10),
            new Person("李四",18));
        /*list.stream()
            .map((e) -> e.getName())
            .forEach(System.out::println);*/

        list.stream()
            .map(Person::getAge)
            .forEach(System.out::println);
    }
}
