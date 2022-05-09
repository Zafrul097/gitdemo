public class Human {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Main{
    public static void main(String[] args){
        Human.myObj = new Human();
        myObj.name = "john";
        system.out.println(myObj.name);
    } 
}