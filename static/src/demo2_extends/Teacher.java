package demo2_extends;

public class Teacher extends People{
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void teacherSay() {
        System.out.println("老师发布问题");
    }

}
