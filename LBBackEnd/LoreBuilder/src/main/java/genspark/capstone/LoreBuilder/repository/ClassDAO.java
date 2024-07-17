package genspark.capstone.LoreBuilder.repository;
import genspark.capstone.LoreBuilder.entity.Class;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDAO extends MongoRepository<Class, ObjectId> {
}
