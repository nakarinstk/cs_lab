/**
 * NumericQuestion
 */
public class NumericQuestion extends Question {

    public NumericQuestion(String text) {
        super(text);
    }

    @Override
    public boolean checkAnswer(String response) {
        return (Math.abs(Double.parseDouble(response) - (Double.parseDouble(super.getAnswer()))) <= 0.01);
    }
}