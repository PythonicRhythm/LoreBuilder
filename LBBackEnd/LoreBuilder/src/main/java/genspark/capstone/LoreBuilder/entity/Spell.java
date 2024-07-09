package genspark.capstone.LoreBuilder.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Spell")
@Getter
@Setter
public class Spell {
    @Id
    private ObjectId id;
    private String castingTime;
    private String[] classes;
    private Components components;
    private String description;
    private String duration;
    private String level;
    private String name;
    private String range;
    private boolean ritual;
    private String school;
    private String[] tags;
    private String type;
}

@Getter
@Setter
class Components {
    private boolean material;
    private String raw;
    private boolean somatic;
    private boolean verbal;
}
