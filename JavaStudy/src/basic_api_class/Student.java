package basic_api_class;


import java.util.Objects;

public class Student {

    private String studentNum;

    public Student(String studentNum){
        this.studentNum = studentNum;
    }
    public String getStudentNum(){
        return studentNum;
    }

    @Override
    public boolean equals(Object studentNum) {
        return this.studentNum.equals(this.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.studentNum);
    }
}
