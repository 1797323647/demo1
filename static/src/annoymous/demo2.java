package annoymous;

public class demo2 {
    public static void main(String[] args) {

        eat eat = new eat() {
            @Override
            public void eat() {
                System.out.println("学生在快乐的干饭！");
            }
        };
        go(eat);


    }

    public static void go(eat eat){
        System.out.println("开始干饭");
        eat.eat();
    }
}

//class Student implements eat{
//
//    @Override
//    public void eat() {
//        System.out.println("学生在快乐的干饭！");
//    }
//}

interface eat {
    void eat();
}
