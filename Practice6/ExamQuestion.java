public abstract class ExamQuestion implements Scorable {
    protected String text;
    protected double maxPoints;

    public ExamQuestion(String txt, double max) {
        this.text = txt;
        this.maxPoints = max;
    }

    @Override
    abstract public double getScore();
}
