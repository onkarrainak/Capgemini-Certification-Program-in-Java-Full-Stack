package onetoonebidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer1 {
	@Id
	private int aid;
	private String answer;
	
	@OneToOne(mappedBy = "ans")
	private Question1 que;
	
	public Question1 getQue() {
		return que;
	}
	public void setQue(Question1 que) {
		this.que = que;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	

}
