package innerclass.callback;

public class Callee {
    private int a = 0;
    public void add(){
        a ++ ;
        System.out.println(a);
    }

    private class Cloure implements Incrementable{
        @Override
        public void increment() {
            Callee.this.add();
        }
    }

    public Incrementable getCallBack(){
        return new Cloure();
    }

}
