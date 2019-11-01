package innerclass.callback;

public class Test {
    public static void main(String[] args) {
        Callee callee = new Callee();
        Caller caller = new Caller(callee.getCallBack());
        caller.go();
    }
}
