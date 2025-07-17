package org.example.Q3_Q4_Q5_Q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

        int search = binarySearch.search(new int[]{39, 34, 21, 56, 89, 9, 3, 33, 32}, 9);
        System.out.println(search);

    }
}
