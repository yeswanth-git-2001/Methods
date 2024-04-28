
//All methods will be loaded into the stack to perform the task, an activation will be created
//After completion of the task, activation record will be created
//The main method will be loaded and starts perfoming task inside the main method and it will be removed from the task
public class Method {
    
    //Instance veriables : heap area(inside the object)
    int a, b, c;
    //No return type, no paramteres
    void add(){
        //Local variable : stack area(inside a method)
        int d;
        a = 10;
        b = 20;
        c = a+b;
        //System.out.println(d); you are using the varibale which is declared, but not initialized : compiler will throw an error
        System.out.println("The addition is : " + c);
    }

    //No return type, with parameters
    void sub(int a, int b){
        //Here a, b are local variables, which declared inside this method and not accessible 
        //outside the method, once the activation record is deleted, then the local variables will also will be deleted
        System.out.println("The subtraction is : " + (a-b));
    }

    //With return type, no parameters
    int mul(){
        int a = 10;
        int b = 20;
        return (a*b); //It will return integer from this function, which means you are getting integer data from this method and you can collect in a variable.
    }

    //With return type, with parameters

    int div(int a, int b){
        return (a/b); //Here division will return the double value, you should collect into double variable, other compiler will throw an error : Possible loss of information
    }
}
