package RandomQuestioning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "question_type")
public class QuestionType {

    @Id
    @GeneratedValue
    @JsonIgnore
    int id;

    @NotNull
    @Column(unique=true)
    String type;

    public QuestionType(){

    }

    public QuestionType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
