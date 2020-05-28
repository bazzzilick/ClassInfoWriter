import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class ClassInfoWriter {

    private Class cls;

    public ClassInfoWriter(Class cls){
        this.cls = cls;
    }

    public void printClassName(){
        System.out.println("Name of class: " + cls.getSimpleName());
        System.out.println();
    }

    public void printConstructorsName(){
        Constructor[] constructors = cls.getDeclaredConstructors();
        System.out.println("Constructors of class " + cls.getName() + ":");

        for(int i = 0; i < constructors.length; i++){
            System.out.print(constructors[i].getName() + "(");

            if(constructors[i].getParameterCount() != 0) {
                Class[] argTypes = constructors[i].getParameterTypes();
                for (int j = 0; j < argTypes.length; j++) {
                    System.out.print(argTypes[j] + " arg" + j + " ");
                }
            }

            System.out.println(");");
        }

        System.out.println();
    }

    public void printMethodsName(){
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("Methods of class " + cls.getName() + ":");

        for(int i = 0; i < methods.length; i++){
            System.out.print(methods[i].getReturnType()      + " ");
            System.out.print(methods[i].getName() + "(");

            if(methods[i].getParameterCount() != 0) {
                Class[] argTypes = methods[i].getParameterTypes();
                for (int j = 0; j < argTypes.length; j++) {
                    System.out.print(argTypes[j] + " arg" + j + " ");
                }
            }

            System.out.println(");");
        }

        System.out.println();
    }

}
