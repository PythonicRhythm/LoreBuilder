package genspark.capstone.LoreBuilder.controller;

import genspark.capstone.LoreBuilder.entity.Spell;
import genspark.capstone.LoreBuilder.service.SpellService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SpellController {
    @Autowired
    SpellService spellService;

    @GetMapping("/spell")
    List<Spell> getAllSpell(){
        return this.spellService.getAllSpells();
    }

    @GetMapping("/spell/role")
    List<Spell> getAllSpellByClass(@RequestParam String q){
        return this.spellService.getAllByClassesContaining(q);
    }
    @GetMapping("/spell/level")
    List<Spell> getAllByLevel(@RequestParam String q){
        return this.spellService.getAllByLevel(q);
    }


}
