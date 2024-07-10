package genspark.capstone.LoreBuilder.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Spell")
@Getter
@Setter
public class Spell {
    @Id
    private ObjectId id;
    private String name;
    private String desc;
    private String page;
    private String range;
    private String components;
    private String material;
    private String ritual;
    private String duration;
    private String concentration;
    @Field("casting_time")
    private String castingTime;
    private String level;
    private String school;
    @Field("class")
    private String[] classes;
}

