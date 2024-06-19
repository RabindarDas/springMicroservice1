package com.quiz.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	Quiz save(Quiz quiz);

}
