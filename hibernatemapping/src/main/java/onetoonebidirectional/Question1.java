package onetoonebidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String question;
	
	@OneToOne
	private Answer1 ans;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer1 getAns() {
		return ans;
	}

	public void setAns(Answer1 ans) {
		this.ans = ans;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
}
