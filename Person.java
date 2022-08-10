/**
 * Person
 */
public abstract class Person {
  protected String name; 
  protected String surname;  
  protected String birthday; 

  public Person(String n, String sn, String bd ) {
    this.name = n; 
    this.surname = sn; 
    this.birthday = bd; 
  }

  public String getName() {
    return name; 
  }

  public String getSurname() {
    return surname; 
  }

  public String getBirthday() {
    return birthday; 
  }

  @Override
  public String toString() {
    return "Person: " + 
            "name - " + name + 
            ", surname - " + surname + 
            ", birthday - " + birthday; 
  }
}