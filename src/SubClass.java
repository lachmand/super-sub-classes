public class SubClass extends SuperClass {

  private String subclassItem;

  public  void SomeProtectedMethod(String newValue)
  {
    //note use of super to refer to the public and protected items in the SuperClass
    super.itemProtected = newValue;
  }

  public void SomePrivateDataMethod(String itemPrivate)
  {
    //note how you cannot see the private items in the super class here
    //try super. and  the itemPrivateis not there. So you have to create public or protected getters and setters to change the value
    // a protected item or method can be called from the super class but you cannot directly call it from the Superclass
    //a public item or method is available to everyone.
      super.setItemPrivate(itemPrivate);
  }
}
