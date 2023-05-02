package kakao99.brainform.controller;

import kakao99.brainform.dto.CreateQuestionDto;
import kakao99.brainform.dto.MemberRegisterDTO;
import kakao99.brainform.dto.MultiQuestionDto;
import kakao99.brainform.entity.question.MultipleChoiceQuestion;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    @PostMapping("/api/new-question")
    public ResponseEntity<?> test(@RequestBody MultiQuestionDto obj) {



        return new ResponseEntity<>("설문 생성이 완료되었습니다.", HttpStatus.OK);
    }
}
