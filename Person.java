/**
 * Person
 */
public abstract class Person {
  protected String name; 
  protected String surname;  
  protected int age; 

  public Person(String name, String surname, int age ) {
    this.name = name; 
    this.surname = surname; 
    this.age = age; 
  }

  public String getName() {
    return name; 
  }

  public String getSurname() {
    return surname; 
  }

  public int getAge() {
    return age; 
  }

  @Override
  public String toString() {
    return "Person: " + 
            "name - " + name + 
            ", surname - " + surname + 
            ", age - " + age; 
  }
}