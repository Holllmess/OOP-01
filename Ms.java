public class Ms extends Person{
  private Sex sex;

  public Ms(String name, String surname, int age) {
    super(name, surname, age);
    this.sex = Sex.FEMALE;
  }

  public Sex getSex(){
    return sex;
  }
  
}
