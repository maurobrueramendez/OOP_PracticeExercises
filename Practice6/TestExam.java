public class TestExam {
    public static void main(String[] args) {
        MultipleChoiceQuestion multi1 = new MultipleChoiceQuestion("What is the capital of Malysia? a: Paris; b: Jakarta; c: Kuala Lumpur", 1.00, 'c', 'c');
        MultipleChoiceQuestion multi2 = new MultipleChoiceQuestion("Which is a prime number? a: 4; b: 3; c:9", 1.5, 'b', 'c');
        MultipleChoiceQuestion multi3 = new MultipleChoiceQuestion("What is the population of Spain (millions)? a: Barcelona; b: Madrid; c: Sevilla", 2.5, 'b', 'a');
        MultipleChoiceQuestion multi4 = new MultipleChoiceQuestion("How many moons does Mars have? a: 1; b: None; c: 2", 1.75, 'c', 'c');

        OpenQuestion open1 = new OpenQuestion("Why was Spain not in the UN before 1955?", 3.5, 0.75);
        OpenQuestion open2 = new OpenQuestion("What is the importance of Tirant Lo Blanc in literature?", 3.5, 0.9);
        OpenQuestion open3 = new OpenQuestion("What were the presets for the 100 Years War?", 3, 1);
        OpenQuestion open4 = new OpenQuestion("Explain the development of the French Revolution from 1789 to 1792", 4, 0.25);

        Exam exam = new Exam();
        exam.addQuestion(multi1);
        exam.addQuestion(multi2);
        exam.addQuestion(multi3);
        exam.addQuestion(multi4);
        exam.addQuestion(open1);
        exam.addQuestion(open2);
        exam.addQuestion(open4);

        System.out.println("Total Exam Score: " + exam.getTotalScore());
        System.out.println("Exam Report:");
        exam.printReport();
    }
}
