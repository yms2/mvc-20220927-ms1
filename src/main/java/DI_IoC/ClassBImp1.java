package DI_IoC;

public class ClassBImp1 implements ClassB {

    //ctrl I / ctrl O
    @Override
    public void logic1() {
        System.out.println("클래스 B1의 로직1 메소드");
    }

    @Override
    public void logic2() {
        System.out.println("클래스 B1의 로직2 메소드");

    }

    @Override
    public void logic3() {
        System.out.println("클래스 B1의 로직3 메소드");
    }
}
