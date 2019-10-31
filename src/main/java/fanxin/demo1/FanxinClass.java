package fanxin.demo1;

public class FanxinClass<T> {
    class A <T>{}
    static class B<T>{}
    private T name;
    public FanxinClass(){

    }

    public T getName(){
        return name;
    }

    public <M,N> N getSS(M m){
        N n = null;
        return n;
    }
}
