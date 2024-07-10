package genspark.capstone.LoreBuilder;

import genspark.capstone.LoreBuilder.entity.Spell;
import genspark.capstone.LoreBuilder.repository.SpellDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpellDAOTest {
    @Autowired
    private SpellDAO spellDAO;

    @Test
    public void testFindAllByClassesContainingAndLevel() {
        String testClass = "wizard";
        String testLevel = "cantrip";

        List<Spell> spells = spellDAO.findAllByClassesAndLevel(testClass, testLevel);
        spells.forEach(spell -> System.out.println(spell.getName()));
    }
}
