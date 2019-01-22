public class Main {


    public static void main(String[] args)
    {
        //create superclass using new constructor
        SuperClass aSuperClass = new SuperClass("NewValue");

        //call methods on Superclass
        System.out.println("Protected Item:" + aSuperClass.itemProtected);

        System.out.println("use getter public method to get private value of superclass:" + aSuperClass.getItemPrivate());



        SubClass subClass= new SubClass();

        //note cannot access  subclassItem since it's private. Try typing subClass. and you don't see it.  subClass.

        //can access subclass public methods:
        subClass.SomePrivateDataMethod("NewPrivateItem");
        subClass.SomeProtectedMethod("NewProtected value");

        //can call a method in the superclass as if it's in the subclass
        System.out.println(("Superclass private item" + subClass.getItemPrivate()));

        System.out.println(("can get protected item in superclass" + subClass.itemProtected));
    }
}
