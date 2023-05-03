package kakao99.brainform.repository.question;

import kakao99.brainform.entity.question.SubjectiveQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectiveQuestionRepository extends JpaRepository<SubjectiveQuestion, Long> {
    SubjectiveQuestion save(SubjectiveQuestion subjectiveQuestion);
}