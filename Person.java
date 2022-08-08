/**
 * Person
 */
public class Person {
  private String name; 
  private String surname; 
  private String sex; 
  private String birthday; 

  public Person(String n, String sn, String s, String bd ) {
    this.name = n; 
    this.surname = sn; 
    this.sex = s; 
    this.birthday = bd; 
  }

  public String getName() {
    return name; 
  }

  public String getSurname() {
    return surname; 
  }

  public String getSex() {
    return sex; 
  }

  public String getBirthday() {
    return birthday; 
  }

  @Override
  public String toString() {
    return "Person: " + 
            "name - " + name + 
            ", surname - " + surname + 
            ", sex - " + sex + 
            ", birthday - " + birthday; 
  }
}