package coding_test.javatest;

public class ScoreAnalyzer {

    public int countPassingStudents(int[] scores, int passingScore) {
        int passingStudentsCount = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if (score >= passingScore) {
                passingStudentsCount++;
            }
        }
        return passingStudentsCount;
    }

    public static void main(String[] args) {
        ScoreAnalyzer analyzer = new ScoreAnalyzer();
        int[] scores = {88, 95, 72, 68, 77, 91, 60};
        int passingScore = 75;

        int passingStudentsCount = 0;

        int result = analyzer.countPassingStudents(scores, passingScore);

        System.out.println("75점 이상으로 통과한 학생은 " + result + "명입니다.");
    }
}