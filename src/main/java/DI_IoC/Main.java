package DI_IoC;

public class Main {
    //psvm
    public static void main(String[] args) {

    ClassB classB1 = new ClassBImp1();
    ClassB classB2 = new ClassBImp2();

    ClassA classA = new ClassAImp1(classB1);

    classA.logic1();
    classA.logic2();
    classA.logic3();

    }
}
