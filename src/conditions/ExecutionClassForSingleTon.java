package conditions;

public class ExecutionClassForSingleTon {
    public static void main(String[] args) {
        TestClassSingleton testClassSingleton1=TestClassSingleton.getGetTestClassForSingleton();
        TestClassSingleton testClassSingleton2=TestClassSingleton.getGetTestClassForSingleton();

        testClassSingleton1.x=testClassSingleton1.x.toUpperCase();
        testClassSingleton2.x=testClassSingleton2.x.toUpperCase();

        System.out.println((testClassSingleton1.x));
        System.out.println(testClassSingleton2.x);

}}