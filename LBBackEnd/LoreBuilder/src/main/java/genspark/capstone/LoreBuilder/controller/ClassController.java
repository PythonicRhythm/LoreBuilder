package genspark.capstone.LoreBuilder.controller;

import genspark.capstone.LoreBuilder.entity.Class;
import genspark.capstone.LoreBuilder.service.ClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/class")
    List<Class> findAllClasses(){
        return classService.findAllClasses();
    }
}
