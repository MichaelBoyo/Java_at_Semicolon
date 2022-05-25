package Chibuzo_Assg;

class StudentGradeTracker {
    int getScores(int subject, int student) {
        return scores[subject - 1][student - 1];
    }

    int getStudent1Scores(int subject) {
        return scores[0][subject];
    }

    int getStudent2Scores(int subject) {
        return scores[1][subject];
    }

    int getStudent3Scores(int subject) {
        return scores[2][subject];
    }

    int getHighestScore() {
        largest = scores[0][0];
        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] > largest) {
                    largest = scores[i][j];
                }
            }

        }
        return largest;

    }

    int getLowestScore() {
        lowest = scores[0][0];
        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] < lowest) {
                    lowest = scores[i][j];
                }
            }

        }
        return lowest;
    }


    void setScore(int score) {
        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] == 0) {
                    scores[i][j] = score;
                    return;
                }
            }
        }
    }

    int getStudentTotal(int studentNo) {

        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[studentNo - 1][j] == scores[i][j]) {
                    total[studentNo - 1] += scores[studentNo - 1][j];
                }
            }
        }
        return total[studentNo - 1];
    }

    int getSubjectsTotal(int sub) {

        for (int i = 0; i < subjects; i++) {
            if (sub == 1) {
                totalScore1 += scores[i][sub - 1];
            }
            if (sub == 2) {
                totalScore2 += scores[i][sub - 1];
            }
            if (sub == 3) {
                totalScore3 += scores[i][sub - 1];
            }
        }
        if (sub == 1) {
            return totalScore1;
        }
        if (sub == 2) {
            return totalScore2;
        }
        if (sub == 3) {
            return totalScore3;
        }


        return 0;
    }

    int getSubjectsAverage(int sub) {
        int average1;
        int average2;
        int average3;

        if (sub == 1) {
            average1 = totalScore1 / students;
            return average1;
        }
        if (sub == 2) {
            average2 = totalScore2 / students;
            return average2;
        }
        if (sub == 3) {
            average3 = totalScore3 / students;
            return average3;
        }


        return 0;
    }


    String getBestStudent() {

        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] == largest) {
                    bestStudent = "Student " + (j + 1) + " Scoring " + largest;

                }
            }
        }

        return bestStudent;
    }

    int getNoOfPasses() {
        int passes = 0;

        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] >= 50) {
                    passes++;

                }
            }
        }

        return passes;
    }

    int getNoOfFails() {
        int fails = 0;

        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] < 50) {
                    fails++;

                }
            }
        }

        return fails;
    }

    String getWorstStudent() {

        for (int i = 0; i < subjects; i++) {
            for (int j = 0; j < students; j++) {
                if (scores[i][j] == lowest) {
                    worstStudent = "Student " + (i + 1) + " Scoring " + lowest;
                    break;

                }
            }
        }

        return worstStudent;
    }

    String getSub1BestStudent() {
        int highestSub1 = scores[0][0];
        for (int i = 0; i < subjects; i++) {
            if (scores[i][0] > highestSub1) {
                highestSub1 = scores[i][0];
            }
        }


        for (int i = 0; i < subjects; i++) {
            if (scores[i][0] == highestSub1) {
                return sub1BestStudent = "Student " + (i + 1) + " Scoring " + highestSub1;

            }
        }

        return sub1BestStudent;
    }

    String getSub1WorstStudent() {
        int highestSub1 = scores[0][0];
        for (int i = 0; i < subjects; i++) {
            if (scores[i][0] < highestSub1) {
                highestSub1 = scores[i][0];
            }
        }


        for (int i = 0; i < subjects; i++) {
            if (scores[i][0] == highestSub1) {
                return sub1WorstStudent = "Student " + (i + 1) + " Scoring " + highestSub1;

            }
        }

        return sub1WorstStudent;
    }

    String getSubPassAndFails(int orPass2forFail) {
        int noOfSub1Pass = 0;
        int noOfSub1Fails = 0;
        for (int i = 0; i < subjects; i++) {
            if (scores[i][0] >= 50) {
                noOfSub1Pass++;
            } else noOfSub1Fails++;
        }

        int noOfSub2Pass = 0;
        int noOfSub2Fails = 0;
        for (int i = 0; i < subjects; i++) {
            if (scores[i][1] >= 50) {
                noOfSub2Pass++;
            } else noOfSub2Fails++;
        }

        int noOfSub3Pass = 0;
        int noOfSub3Fails = 0;
        for (int i = 0; i < subjects; i++) {
            if (scores[i][2] >= 50) {
                noOfSub3Pass++;
            } else noOfSub3Fails++;
        }

        int maxPass = noOfSub1Pass;
        int maxFail = noOfSub1Fails;
        String fail = "the hardest subject is 1 with " + maxFail + " failures and " + noOfSub1Pass + " pass";
        String pass = "the easiest subject is 1 with " + maxPass + " passes and " + noOfSub1Fails + " failures";
        for (int i = 0; i < 3; i++) {
            if (noOfSub2Pass > maxPass) {
                maxPass = noOfSub2Pass;
                pass = "the easiest subject is 2 with " + maxPass + " passes and " + noOfSub2Fails + " failures";
            }
            if (noOfSub3Pass > maxPass) {
                maxPass = noOfSub3Pass;
                pass = "the easiest subject is 3 with " + maxPass + " passes and " + noOfSub3Fails + " failures";
            }
        }


        for (int i = 0; i < 3; i++) {
            if (noOfSub2Fails > maxFail) {
                maxFail = noOfSub2Fails;
                fail = "the hardest subject is 2 with " + maxFail + " failures and " + noOfSub2Pass + "passe";
            }
            if (noOfSub3Fails > maxFail) {
                maxFail = noOfSub3Fails;
                fail = "the hardest subject is 3 with " + maxFail + " failures and " + noOfSub3Pass + " passe";
            }
        }
        if (orPass2forFail == 1) {
            return pass;
        }
        if (orPass2forFail == 2) {
            return fail;
        }


        return null;

    }

    String getSub2BestStudent() {
        int highestSub2 = scores[0][1];
        for (int i = 0; i < subjects; i++) {
            if (scores[i][1] > highestSub2) {
                highestSub2 = scores[i][1];
            }
        }

        for (int i = 0; i < subjects; i++) {
            if (scores[i][1] == highestSub2) {
                return sub2BestStudent = "Student " + (i + 1) + " Scoring " + highestSub2;
            }
        }

        return sub2BestStudent;
    }

    String getSub3BestStudent() {
        int highestSub3 = scores[0][2];
        for (int i = 0; i < subjects; i++) {
            if (scores[i][2] > highestSub3) {
                highestSub3 = scores[i][2];
            }
        }

        for (int i = 0; i < subjects; i++) {
            if (scores[i][2] == highestSub3) {
                return sub2BestStudent = "Student " + (i + 1) + " Scoring " + highestSub3;
            }
        }

        return sub2BestStudent;
    }

    int getAverage(int studentTotal) {
        int average = studentTotal / students;


        for (int i = 0; i < subjects; i++) {
            if (studentAverages[i] == 0) {
                studentAverages[i] = average;
                break;
            }

        }

        return average;
    }

    int students;
    int subjects;
    int[][] scores;
    int largest;
    int lowest;

    int getTotal(int[] studentScores) {
        int total = 0;
        for (int i = 0; i < students; i++) {
            total += studentScores[i];
        }

        return total;
    }

    int[] total;
    int[] totalSort;
    int[] studentAverages;
    int[] position;
    int totalScore1;
    int totalScore2;
    int totalScore3;

    String sub1BestStudent;
    String sub1WorstStudent;
    String sub2BestStudent;
    String sub3BestStudent;
    String bestStudent;
    String worstStudent;


    StudentGradeTracker(int subjects, int students) {
        this.subjects = subjects;
        studentAverages = new int[subjects];
        scores = new int[subjects][students];
        this.students = students;
        total = new int[students];
        position = new int[students];
        totalSort = new int[students];
    }

    private int getStudentPosition(int[] reversed, int studentAverage) {
        for (int j = 0; j < reversed.length; j++) {
            if (reversed[j] == studentAverage) {
                return j + 1;
            }
        }
        return 0;
    }

    public int getStudentPositionFromGrade(int studentAverage) {
        int[] averageScore = new int[students];
        for (int i = 0; i < students; i++) {

            averageScore[i] = getAverage(i + 1);
        }
//        averageScore = removeDuplicates(averageScore);
//        averageScore = sortAndReverseStudentAverageScore(averageScore);
        return getStudentPosition(averageScore, studentAverage);
    }

    public int[] getScore(int studentNo) {
        int[] studentScore = new int[subjects];

        for (int j = 0; j < subjects; j++) {
            studentScore[j] = scores[studentNo - 1][j];
        }

        return studentScore;
    }

    public int getPosition(int[] Averages, int studentNo) {
        int position1 = Averages[0];
        int position2 = Averages[0];
        int position3 = Averages[0];

        for (int i = 0; i < Averages.length; i++) {
            if (Averages[i] > position1) {
                position2 = position3;
                position2 = position1;
                position1 = Averages[i];
            }
        }
        int position = 0;

        if (Averages[studentNo - 1] == position1) {
            position = 1;
        }
        if (Averages[studentNo - 1] == position2) {
            position = 2;
        }
        if (Averages[studentNo - 1] == position3) {
            position = 3;
        }


        return position;
    }

}