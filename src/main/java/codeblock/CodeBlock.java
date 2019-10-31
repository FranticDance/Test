package codeblock;

public class CodeBlock {


    static {
        System.out.println("静态代码块...");

    }
    private static CodeBlock codeBlock = new CodeBlock();

    {
        System.out.println("构造代码块...");
    }

    public CodeBlock(){
        System.out.println("构造函数...");
    }
    public void sayHello(){
        System.out.println("普通代码块...");
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        CodeBlock codeBlock = new CodeBlock();
        codeBlock.sayHello();
        System.out.println("----------------------------------------");

        CodeBlock codeBlock1 = new CodeBlock();
        codeBlock1.sayHello();

    }
}
