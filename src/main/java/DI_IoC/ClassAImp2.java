package DI_IoC;

public class ClassAImp2 implements ClassB {
    private ClassB classB;
    public ClassAImp2(ClassB classB) {
        super();
        this.classB = classB;
    }
    @Override
    public void logic1() {
        System.out.println("클래스 A2의 로직1 메소드");
        classB.logic1();
    }

    @Override
    public void logic2() {
        System.out.println("클래스 A2의 로직2 메소드");
        classB.logic2();
    }

    @Override
    public void logic3() {
        System.out.println("클래스 A2의 로직3 메소드");
        classB.logic3();
    }
}
