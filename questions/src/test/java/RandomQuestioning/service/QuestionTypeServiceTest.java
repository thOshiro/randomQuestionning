package RandomQuestioning.service;

import RandomQuestioning.dao.QuestionTypeRepository;
import RandomQuestioning.entity.QuestionType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class QuestionTypeServiceTest {

    @Mock
    private QuestionTypeRepository questionTypeRepository;

    QuestionType questionType;

    @Autowired
    private QuestionTypeService questionTypeService;

    @TestConfiguration
    static class QuestionTypeServiceImplIntegrationTest {

        @Bean
        public QuestionTypeService questionTypeService() {
            return new QuestionTypeService();
        }
    }

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        questionType = new QuestionType("comedy");
    }

    @Test
    public void saveTest(){
        when(questionTypeRepository.save(questionType)).thenReturn(questionType);

        Optional<QuestionType> savedQuestionType = questionTypeService.save(questionType);

        assertTrue(savedQuestionType.isPresent());
        assertEquals(savedQuestionType.get().getType(), "comedy");
    }
}
