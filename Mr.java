public class Mr extends Person {
  private Sex sex;

  public Mr(String name, String surname, int age) {
    super(name, surname, age);
    this.sex = Sex.MALE;
  }
  
  public Sex getSex(){
    return sex;
  }
}
