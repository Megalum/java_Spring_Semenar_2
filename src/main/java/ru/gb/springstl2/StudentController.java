package ru.gb.springstl2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("student")
    public List<Student> getAll(){
        return repository.getAll();
    }

    @GetMapping("student/{id}")
    public Student getById(@PathVariable long id){
        return repository.getById(id);
    }

    @GetMapping("student/search")
    public List<Student> getByStudent(@RequestParam String name){
        return repository.searchByName(name);
    }

    @GetMapping("group/{groupName}/student")
    public List<Student> getByGroup(@PathVariable String groupName){
        return repository.searchByGroup(groupName);
    }
}
