package com.example.springcloudgeografi.repository;

import com.example.springcloudgeografi.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
