package app;

import java.util.Scanner;

public class Main {
	
	public static void takeTest(Question[] questions) {
		int score = 0 ;
		Scanner keyboardInput = new java.util.Scanner(System.in);
		for(int i = 0 ; i < questions.length ; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)){
				score ++;
			}
		}
		
		System.out.println("votre score est :" + score + "/"+questions.length);
	}

	public static void main(String[] args) {

		String q1 = "la couleur d'une pomme est?\n"
				+ "(a)rouge/(b)bleu/(c)vert ";
		
		String q2 = "la couleur d'une fraise est?\n"
				+ "(a)Vert/(b)rouge/(c)gris ";
		
		Question[] questions = {
				new Question(q1,"c"),
				new Question(q2,"b")};
		 
		takeTest(questions);
	}

}
