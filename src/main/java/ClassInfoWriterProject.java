import SomePackage.ClassInPackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassInfoWriterProject {

    public static void main(String[] args){

        ClassInfoWriter testClass = new ClassInfoWriter(TestClass.class);
        testClass.printClassName();
        testClass.printConstructorsName();
        testClass.printMethodsName();

        ClassInfoWriter classInPackage = new ClassInfoWriter(ClassInPackage.class);
        classInPackage.printClassName();
        classInPackage.printConstructorsName();
        classInPackage.printMethodsName();

        ClassInfoWriter emptyClass = new ClassInfoWriter(EmptyClass.class);
        emptyClass.printClassName();
        emptyClass.printConstructorsName();
        emptyClass.printMethodsName();


        try {
            Method method = TestClass.class.getDeclaredMethod("doSomethingSecret");
            method.setAccessible(true);
            System.out.println(method.invoke(TestClass.class.newInstance()));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
