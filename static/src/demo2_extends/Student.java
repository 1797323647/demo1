package demo2_extends;

public class Student extends People{

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void listenClass() {
        System.out.println("学生听课反馈");
    }

}
