package com.quiz.service;

import java.util.List;

import com.quiz.entities.Quiz;

public interface QuizService {
	Quiz add(Quiz quiz);
	List<Quiz> get();
	//Quiz ger(Long id);
	Quiz get(Long id);

}
