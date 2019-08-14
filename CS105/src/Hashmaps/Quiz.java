package Hashmaps;

import java.util.HashMap;

public class Quiz {
	
		private HashMap<Question, Answer> qas = new HashMap<Question, Answer>();

		public HashMap<Question, Answer> getQas() {
			return qas;
		}

		public void setQas(HashMap<Question, Answer> qas) {
			this.qas = qas;
		}
		/**
		 * This is an alternative commenting method
		 * @param q
		 * @param a
		 */
		public void addQuiz(Question q, Answer a) {
			qas.put(q,a);
		}
		

		

	    


}
