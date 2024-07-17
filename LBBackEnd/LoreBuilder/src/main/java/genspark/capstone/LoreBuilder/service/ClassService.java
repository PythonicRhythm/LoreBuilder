package genspark.capstone.LoreBuilder.service;

import genspark.capstone.LoreBuilder.entity.Class;
import genspark.capstone.LoreBuilder.repository.ClassDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassDAO classDAO;

    public List<Class> findAllClasses(){
        return this.classDAO.findAll();
    }
}
