import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices = new ArrayList<>();

    public ChoiceQuestion(String text) {
        super(text);
    }

    public void addChoice(String choice, boolean correct) {
        this.choices.add(choice);
        if (correct) {
            super.setAnswer(choice);
        }
    }

    @Override
    public void display() {
        System.out.println(super.getQuestion());
        System.out.println(this.choices.toString());
    }

    @Override
    public boolean checkAnswer(String response) {
        String ans = choices.get(Integer.parseInt(response) - 1);
        if (ans.equals(this.getAnswer())) {
            return true;
        }
        return false;
    }

}