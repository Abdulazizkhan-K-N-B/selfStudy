package com.aknb.interview.sitelabs;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName = "A";
    private final String lastName = "B";
    private final List<String> subjects = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
