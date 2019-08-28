package conditions;

public class TestClassSingleton {
    String x;
    private static TestClassSingleton getTestClassForSingleton=null;
  public TestClassSingleton(){
      x="this is a singleton";
  }
  public static TestClassSingleton getGetTestClassForSingleton(){
      if (getTestClassForSingleton==null) {
          getTestClassForSingleton = new TestClassSingleton();
      }
      return getTestClassForSingleton;
      }
  }

