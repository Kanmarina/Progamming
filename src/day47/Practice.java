package day47;

public class Practice {
    private void doSomething(){

    }
}

class JavaPractice extends Practice{
    private void doSomething(){

    }
}
/*
Not all classes meant to be a super class
 So in order to block a class from being a super class,
 final keyword can be used on class declaration
public final class SmartTV{ }
public class SumsungSmartTV extends SmartTV {} COMPILER ERROR!!
Not all methods meant to be overridden
 So in order to block a method from being overridden in sub class
 final keyword can be used on method header
public final void doSomething{ }  in super class
public void doSomething{ } in sub class -->>  COMPILER ERROR!!
Not all variables meant to be reassigned value after first initial value
 So in order to block a variable (local variable, method parameter, fields) being reassigned new value
 final keyword can be used on variable.
 final int x = 10 ;
x = 20 ;  COMPILER ERROR!!
 */