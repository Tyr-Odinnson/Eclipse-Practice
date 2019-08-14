package Hashmaps;

import java.util.Map.Entry;
import java.util.Iterator;


public class QuizTest {
	
	public static void main(String[] args) {
		//1. Create new quiz obj
		Quiz quiz = new Quiz();
		//2. Add qas to the quiz
		Question q1 = new Question();
		q1.setQ("What is the capital of England?");
		Answer a1 = new Answer();
		a1.setA("London");
		
		Question q2 = new Question();
		q2.setQ("Which country was Anime started?");
		Answer a2 = new Answer();
		a2.setA("Japan");
		
		Question q3 = new Question();
		q3.setQ("Who is the most famous Anime character in history?");
		Answer a3 = new Answer();
		a3.setA("Pikachu");
		
		Question q4 = new Question();
		q4.setQ("What is Manga?");
		Answer a4 = new Answer();
		a4.setA("Japanese comics");
		
		quiz.addQuiz(q1, a1);
		quiz.addQuiz(q2, a2);
		quiz.addQuiz(q3, a3);
		quiz.addQuiz(q4, a4);
		
		//3. Loop through the quiz to print all
		Iterator it = quiz.getQas().entrySet().iterator();
		while (it.hasNext()) {
			Entry<Question, Answer> qa = (Entry<Question, Answer>) it.next();
			System.out.println(qa.getKey());
			System.out.println("Answer: " + qa.getValue());
			
		}
		
			    
		
	}
	

}
