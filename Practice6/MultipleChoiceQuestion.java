public class MultipleChoiceQuestion extends ExamQuestion {
    private final char correct;
    private final char chosen;

    public MultipleChoiceQuestion(String txt, double max, char co, char ch) {
        super(txt, max);
        this.correct = co;
        this.chosen = ch;
    }

    @Override
    public double getScore() {
        if(this.chosen == this.correct) {return this.maxPoints;}
        else {return 0;}
    }
}
