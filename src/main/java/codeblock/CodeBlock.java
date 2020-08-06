package codeblock;

import java.util.Date;

/**
 * 执行顺序 静态代码块
 */
public class CodeBlock {

    private static CodeBlock codeBlock = new CodeBlock();
    static {
        System.out.println("静态代码块...");

    }
    static {
        System.out.println("静态代码块2...");
        //也由于静态成员和代码块是按照定义的顺序执行的，所以位于前面位置的静态代码块是访问不到后面定义的静态成员的
        //System.out.println(date);
    }


    private static Date date = new Date();
    static {
        System.out.println("静态代码块3...");
        //这里就可以访问了
        System.out.println(date);
    }

    {
        System.out.println("构造代码块...");
    }
    {
        System.out.println("构造代码块2...");
    }

    public CodeBlock(){

        System.out.println("构造函数...");
    }
    public void sayHello(){
        {
            //只是形式有点像构造代码块，实际就和普通写在方法体中的代码一样。没有啥特别的执行顺序，相当于把几行代码包在一起而已
            System.out.println("方法体内块...");
        }
        System.out.println("hello Tim");
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        CodeBlock codeBlock = new CodeBlock();
        codeBlock.sayHello();
        System.out.println("----------------------------------------");

        /*CodeBlock codeBlock1 = new CodeBlock();
        codeBlock1.sayHello();*/

    }
}
