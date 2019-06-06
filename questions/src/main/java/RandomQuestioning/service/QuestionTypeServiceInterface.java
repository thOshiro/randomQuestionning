package RandomQuestioning.service;// https://mvnrepository.com/artifact/log4j/log4j


import RandomQuestioning.entity.QuestionType;

import java.util.Optional;

public interface QuestionTypeServiceInterface {

    Optional<QuestionType> save(QuestionType questionType);
    Optional<QuestionType> update(QuestionType questionType);
    Optional<QuestionType> delete(QuestionType questionType);
    Optional<QuestionType> findByType(String type);
}
