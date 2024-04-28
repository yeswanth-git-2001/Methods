class Main {
    public static void main(String[] args) {
        //Reference variable : which points to the object in heap area from stack area to the object.
        Method method = new Method();
        method.add();
        method.sub(30, 20);//Same process will be applicable to the all methods
        int collect = method.mul();
        System.out.println("The multiplication is : " + collect);

        double d = method.div(17,3);
        System.out.println("The division is : " + d);
    }
    //After this point the reference variable will not be pointing to the any object inside the heap 
    //So, garbage collector will remove all the objects which is not pointing any reference variable
}
