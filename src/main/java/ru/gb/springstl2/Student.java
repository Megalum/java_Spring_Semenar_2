package ru.gb.springstl2;

import lombok.Data;

@Data
public class Student {

    private static long curId = 0;
    private final long id;
    private final String name;
    private final String nameGroup;

    public Student(String name, String nameGroup) {
        this.id = curId++;
        this.name = name;
        this.nameGroup = nameGroup;
    }
}
