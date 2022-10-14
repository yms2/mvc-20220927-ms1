package lambda;

@FunctionalInterface
//개발자가 실수하지말라고 넣어주는 것.(중복이 안도게 해준다.
public interface Addition {
    public int add(int[] numbers);
}
