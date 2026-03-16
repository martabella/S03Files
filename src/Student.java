public class Student {
    private String username;
    private float tae;
    private float pr;
    private float exam;

    public Student(String username, float tae, float pr, float exam) {
        this.username = username;
        this.tae = tae;
        this.pr = pr;
        this.exam = exam;
    }

    public String getUsername() {
        return username;
    }

    public float media(){
        return ((float) 0.1*tae+ (float)0.4*pr+ (float)0.5*exam);
    }
}
