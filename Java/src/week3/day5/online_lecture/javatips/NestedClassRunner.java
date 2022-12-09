package week3.day5.online_lecture.javatips;
public class NestedClassRunner {

    int i;
    class InnerClass{
        public void method(){
            i = 5;
        }
    }

    static class StaticNestedClass{
//        i = 5; //불가
    }

    public static void main(String[] args) {
        //InnerClass innerClass = new InnerClass(); //허용 X

        //NestedClassRunner의 인스턴스 없이도 생성가능
        StaticNestedClass staticNestedClass = new StaticNestedClass();

        //NestedClassRunner 인스턴스를 통해 생성 가능
        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass();

    }
}
