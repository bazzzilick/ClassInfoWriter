package SomePackage;

public class ClassInPackage {

    public ClassInPackage(int num){}

    private ClassInPackage(){}

    private ClassInPackage(int num, String name){}

    public void doSomething(){}

    public int foo(){
        return 0;
    }

    private String doSomethingSecret() {
        return "default string";
    }
}
