package RandomQuestioning.service;

import RandomQuestioning.dao.QuestionTypeRepository;
import RandomQuestioning.entity.QuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class QuestionTypeService implements QuestionTypeServiceInterface {


    @Autowired
    QuestionTypeRepository questionTypeRepository;

    @Override
    public Optional<QuestionType> save(QuestionType questionType) {
        return Optional.of(questionTypeRepository.save(questionType));
    }

    @Override
    public Optional<QuestionType> update(QuestionType questionType) {
        return Optional.empty();
    }

    @Override
    public Optional<QuestionType> delete(QuestionType questionType) {
        return Optional.empty();
    }

    @Override
    public Optional<QuestionType> findByType(String type) {
        return Optional.empty();
    }
}
