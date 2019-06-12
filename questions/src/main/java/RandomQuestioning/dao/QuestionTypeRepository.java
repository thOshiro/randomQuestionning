package RandomQuestioning.dao;

import RandomQuestioning.entity.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {

    QuestionType save(QuestionType questionType);

}
