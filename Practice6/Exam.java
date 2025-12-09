import java.util.ArrayList;
public class Exam {
    private final ArrayList<ExamQuestion> exam;

    public Exam() {
        exam = new ArrayList<>();
    }

    public void addQuestion(ExamQuestion q) {
        exam.add(q);
    }

    public double getTotalScore() {
        double score = 0;
        for(int i = 0; i < this.exam.size(); i++) {
            ExamQuestion temp = exam.get(i);
            score += temp.getScore();
        }
        return score;
    }

    public void printReport() {
        for(int i = 0; i < this.exam.size(); i++) {
            ExamQuestion temp = exam.get(i);
            System.out.println("Question " + (i+1) + ": " + temp.text);
            System.out.println(" - Score: " + temp.getScore());
        }
    }
}