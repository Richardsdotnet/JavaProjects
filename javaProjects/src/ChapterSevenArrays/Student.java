package ChapterSevenArrays;

public class Student {
    private int fullName;
    private  int javaScores;
    private int pythonScore;
    private  int dataBaseScore;

    public int getFullName() {
        return fullName;
    }

    public void setFullName(int fullName) {
        this.fullName = fullName;
    }

    public int getJavaScores() {
        return javaScores;
    }

    public void setJavaScores(int javaScores) {
        this.javaScores = javaScores;
    }

    public int getPythonScore() {
        return pythonScore;
    }

    public void setPythonScore(int pythonScore) {
        this.pythonScore = pythonScore;
    }

    public int getDataBaseScore() {
        return dataBaseScore;
    }

    public void setDataBaseScore(int dataBaseScore) {
        this.dataBaseScore = dataBaseScore;
    }

    @Override
    public String toString() {
        int total = javaScores + pythonScore + dataBaseScore;
        double average = total/ 3.0;
       return String.format("""
               %s       %s       %s      %s      %s      %s""", fullName, javaScores, pythonScore,dataBaseScore, total, average);
    }
}
