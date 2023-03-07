package lab06Constructor;
/**
 * Constructor
 */
public class Constructor {
    // constructor for variable 
    int x;
    // constructor for function
    public void println(String input) {
        System.out.println("This is the constructor " + input );
    }
    // constructor for object
    Constructor myobj1;
    
    //This is the constructor //Overload constructor
    public Constructor() {
        x = 0;
        println("hello world");
        myobj1 = new Constructor();
    }

    public Constructor(String input) {
        x = 0;
        println(input);
    }
}