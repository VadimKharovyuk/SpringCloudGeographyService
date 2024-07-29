package com.example.springcloudgeografi.controller;

import com.example.springcloudgeografi.model.Question;
import com.example.springcloudgeografi.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private  QuestionRepo questionRepo;

    @GetMapping("/sections")
    public List<Question> getQuestion(@RequestParam(value = "amount", defaultValue = "10") int amount) {
        List<Question> questions =questionRepo.findAll();
        Collections.shuffle(questions);
        return questions.stream().limit(amount).collect(Collectors.toList());
    }
@GetMapping("/all")
    List<Question> questionList (){
      return   questionRepo.findAll();
}
}
