public class Relation {
  private Person firstPerson; 
  private Person secondPerson; 
  private Role role; 

  public Relation(Person p1, Person p2, Role r) {
    this.firstPerson = p1;
    this.secondPerson = p2;
    this.role = r;
  }

  @Override
  public String toString() {
    return "First person: " + firstPerson +
            ", second person: " + secondPerson + 
            ", role: " + role;
  }

  public Person getFirstPerson(){
    return firstPerson;
  }

  public Person getSecondPerson(){
    return secondPerson;
  }

  public Role getRole(){
    return role;
  }
}
