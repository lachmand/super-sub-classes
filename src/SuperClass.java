public class SuperClass {

  public SuperClass() {
  }

  public SuperClass(String itemPrivate) {
    this.itemPrivate = itemPrivate;
  }

  protected String itemProtected;
  private String itemPrivate;

  public String getItemPrivate() {
    return itemPrivate;
  }

  public void setItemPrivate(String itemPrivate) {
    this.itemPrivate = itemPrivate;
  }

}
