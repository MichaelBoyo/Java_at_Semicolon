package Chibuzo_Assg;

public class StudentGradeTracker {
    int students;
    int subjects;
    int[][] scores;

    int[] total;
    int[] position;


    public StudentGradeTracker(int subjects, int students) {
        this.subjects = subjects;
        scores = new int[subjects][students];
        this.students = students;
        total = new int[students];
        position = new int[students];
    }

    public void setScore(int score) {
        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] == 0) {
                    scores[i][j] = score;
                    return;
                }
            }
        }
    }


    public int getStudentTotal(int subjectNo) {

        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[subjectNo - 1][j] == scores[i][j]) {
                    total[subjectNo-1] += scores[subjectNo - 1][j];

                }
            }
        }

        return total[subjectNo-1];
    }

    public double getAverage(int subjectNo) {

        return (double) total[subjectNo-1]/students;
    }

    public int getPosition(int subjectNo) {
        int max = total[0];

        for (int i = 0; i < total.length; i++) {
            max= Math.max(max,total[i]);
                if(max==total[i]){
                    position[subjectNo-1]=i+1;
                } else if (max<total[i]) {
                    position[subjectNo-1]=i+1;
                }

        }

        return position[subjectNo-1];
    }
}