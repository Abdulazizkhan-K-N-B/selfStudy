package com.aknb.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aknb.tasks.Exercises01.AllClass;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
        
        AllClass allClass = new AllClass();
        allClass.param2();
    }

}
