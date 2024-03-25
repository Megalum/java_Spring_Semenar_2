package ru.gb.springstl2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentRepository {
    private final List<Student> list;

    public StudentRepository() {
        list = new ArrayList<>();
        list.add(new Student("Иван", "ПОИТ-11"));
        list.add(new Student("Андрей", "ПОИТ-11"));
        list.add(new Student("Дмитрий", "ПОИТ-11"));
        list.add(new Student("Станислав", "ПОИТ-21"));
        list.add(new Student("Аркадий", "ПОИТ-21"));
        list.add(new Student("Дмитрий", "ПОИТ-11"));
        list.add(new Student("Владилав", "ПОИТ-21"));
        list.add(new Student("Кирилл", "ПОИТ-11"));
        list.add(new Student("Иван", "ПОИТ-21"));
        list.add(new Student("Станислав", "ПОИТ-11"));
        list.add(new Student("Сергей", "ПОИТ-21"));

    }

    public Student getById(long id){
        return list.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAll(){
        return List.copyOf(list);
    }

    public List<Student> searchByName(String name){
        return list.stream()
                .filter(e -> e.getName().contains(name))
                .collect(Collectors.toList());
    }

    public List<Student> searchByGroup(String groupName){
        return list.stream()
                .filter(e -> e.getNameGroup().equals(groupName))
                .collect(Collectors.toList());
    }

}
