package C7_Java;

public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setScore(int score) {
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades.length; j++) {
                if (grades[i][j] == 0) {
                    grades[i][j] = score;
                    return;
                }
            }

        }
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void processGrades() {
        outPutGrades();

        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade  is", getMinimum(),
                "Highest grade  is", getMaximum());

    }

    public void outPutGrades() {
        System.out.println("=".repeat(56));
        System.out.print("Student        ");
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Sub %d   ", test + 1);
        }
        System.out.print("  Total   ");
        System.out.println("Average");
        System.out.println("=".repeat(56));
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {

                System.out.printf("%8d", test);
            }

            int total = getTotal(grades[student]);
            double average = getAverage(grades[student]);
            System.out.printf("%9d %9.2f  %n", total, average);
        }
        System.out.println("=".repeat(56));
        System.out.println("=".repeat(56));

    }


    private double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    private int getTotal(int[] grades) {
        int total = 0;

        for (int grade : grades) {
            total += grade;
        }
        return total;
    }


    private int getMaximum() {
        int highGrade = grades[0][0];

        for (int[] studentGrades : grades) {

            for (int grade : studentGrades) {

                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }

        return highGrade;
    }

    public int getMinimum() {
        int lowGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            // loop through columns of current row
            for (int grade : studentGrades) {
                // if grade less than lowGrade, assign it to lowGrade
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }
}

