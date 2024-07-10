package genspark.capstone.LoreBuilder.repository;

import genspark.capstone.LoreBuilder.entity.Spell;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpellDAO extends MongoRepository<Spell, ObjectId> {
    List<Spell> findAllByClassesContaining(String classes);
    List<Spell> findAllByLevel(String level);
    List<Spell> findAllByClassesAndLevel(String classes, String level);

}
