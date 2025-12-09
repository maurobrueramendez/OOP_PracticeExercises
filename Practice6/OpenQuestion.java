public class OpenQuestion extends ExamQuestion {
    private final double gradeFraction;

    public OpenQuestion(String txt, double max, double gf) {
        super(txt, max);
        this.gradeFraction = gf;
    }

    @Override
    public double getScore() {
        return this.maxPoints * this.gradeFraction;
    } 
}
