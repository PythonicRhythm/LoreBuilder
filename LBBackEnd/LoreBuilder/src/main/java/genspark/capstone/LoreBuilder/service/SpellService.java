package genspark.capstone.LoreBuilder.service;

import genspark.capstone.LoreBuilder.entity.Spell;
import genspark.capstone.LoreBuilder.repository.SpellDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellService {
    @Autowired
    SpellDAO spellDAO;

    public List<Spell> getAllSpells(){
        return this.spellDAO.findAll();
    }

    public List<Spell> getAllByClassesContaining(String classes){
        return this.spellDAO.findAllByClassesContaining(classes);

    }
    public List<Spell> getAllByLevel(String level){
        return this.spellDAO.findAllByLevel(level);
    }

    public List<Spell> getAllByClassAndLevel(String classes, String level){
        return this.spellDAO.findAllByClassesAndLevel(classes,level);
    }
}
