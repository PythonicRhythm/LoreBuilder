package genspark.capstone.LoreBuilder.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Class")
@Getter
@Setter
public class Class {
    @Id
    private ObjectId id;
    @Field("class")
    private List<Classes> class_field;
    private List<Subclass> subclass;
    private List<ClassFeature> classFeature;
    private List<SubclassFeature> subclassFeature;
}
@Getter
@Setter
class Classes {
    private String name;
    private String source;
    private Long page;
    private Boolean srd;
    private Boolean basicRules;
    private Hd hd;
    private List<String> proficiency;
    private String spellcastingAbility;
    private String casterProgression;
    private String preparedSpells;
    private List<Long> cantripProgression;
    private StartingProficiencies startingProficiencies;
    private StartingEquipment startingEquipment;
    private Multiclassing multiclassing;
    private List<ClassTableGroup> classTableGroups;
    private List<?> classFeatures;
    private String subclassTitle;
    private List<Fluff> fluff;
}
@Getter
@Setter
class Hd {
    private Long number;
    private Long faces;
}
@Getter
@Setter
class StartingProficiencies {
    private List<String> armor;
    private List<String> weapons;
    private List<Skill> skills;
}
@Getter
@Setter
class Skill {
    private Choose choose;
}
@Getter
@Setter
class Choose {
    private List<String> from;
    private Long count;
}
@Getter
@Setter
class StartingEquipment {
    private List<Boolean> additionalFromBackground;
    @Field("default")
    private List<String> defaults;
    private String goldAlternative;
    private List<DefaultDaum> defaultData;
}
@Getter
@Setter
class DefaultDaum {
    private List<String> a;
    private List<?> b;
    private List<String> c;
    @Field("_")
    private List<String> field;
}
@Getter
@Setter
class Multiclassing {
    private Requirements requirements;
    private ProficienciesGained proficienciesGained;
}
@Getter
@Setter
class Requirements {
    private Long wis;
}
@Getter
@Setter
class ProficienciesGained {
    private List<String> armor;
}
@Getter
@Setter
class ClassTableGroup {
    private List<String> colLabels;
    private List<List<?>> rows;
    private String title;
    private List<List<Long>> rowsSpellProgression;
}
@Getter
@Setter
class Fluff {
    private String name;
    private String type;
    private List<?> entries;
    private String source;
    private Long page;
}
@Getter
@Setter
class Subclass {
    private String name;
    private String shortName;
    private String source;
    private String className;
    private String classSource;
    private Long page;
    private List<AdditionalSpell> additionalSpells;
    private List<String> subclassFeatures;
    private Boolean srd;
    private Boolean basicRules;
    private Boolean isReprinted;
    private List<OtherSource> otherSources;
}
@Getter
@Setter
class AdditionalSpell {
    private Prepared prepared;
//    private Known known;
}
@Getter
@Setter
class Prepared {
    @Field("1")
    private List<String> n1;
    @Field("3")
    private List<String> n3;
    @Field("5")
    private List<String> n5;
    @Field("7")
    private List<String> n7;
    @Field("9")
    private List<String> n9;
//    @Field("17")
//    private List<n17> n17;
}
@Getter
@Setter
class n17 {
    private String choose;
}
//@Getter
//@Setter
// class Known {
//    @Field("1")
//    private Any n1;
//}
@Getter
@Setter
class OtherSource {
    private String source;
    private Long page;
}
@Getter
@Setter
class ClassFeature {
    private String name;
    private String source;
    private Long page;
    private List<Boolean> srd;
    private Boolean basicRules;
    private String className;
    private String classSource;
    private Long level;
    private List<?> entries;
    private Boolean isClassFeatureVariant;
    private Consumes consumes;
    private Long header;
}
@Getter
@Setter
class Consumes {
    private String name;
}
@Getter
@Setter
class SubclassFeature {
    private String name;
    private String source;
    private Long page;
    private String className;
    private String classSource;
    private String subclassShortName;
    private String subclassSource;
    private Long level;
    private List<?> entries;
    private Long header;
    private Consumes2 consumes;
    private Boolean isClassFeatureVariant;
    private Boolean srd;
    private Boolean basicRules;
    private List<OtherSource2> otherSources;
}
@Getter
@Setter
class Consumes2 {
    private String name;
}
@Getter
@Setter
class OtherSource2 {
    private String source;
    private Long page;
}
