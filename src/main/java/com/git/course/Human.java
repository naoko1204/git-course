package com.git.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString(exclude = "age")
public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private Gender gender;
}
