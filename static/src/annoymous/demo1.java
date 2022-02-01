package annoymous;

import java.security.PublicKey;

public class demo1 {

    public static void main(String[] args) {

        swim swim = new student();
        go(swim);

    }

    public static void go(swim swim){
        System.out.println("游泳比赛开始了");
        swim.swimming();
        System.out.println("游泳比赛结束了");
    }


}

class student implements swim{


    @Override
    public void swimming() {
        System.out.println("学生快乐的自由泳！！！");
    }
}



interface swim{
    void swimming();
}


