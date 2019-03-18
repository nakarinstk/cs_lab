/**
 * Question
 */
public class Question {
    private String text, answer;

    public Question(String text) {
        this.text = text;
    }

    public Question() {

    }

    public String getQuestion() {
        return this.text;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void display() {
        System.out.println(this.text);
    }

    public boolean checkAnswer(String response) {
        return this.answer.equals(response);
    }
}