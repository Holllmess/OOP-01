public class move {
  public static void main(String[] args) {
    Person p1 = new Person("Dmitriy", "Spasskih", "Male", "23.06.2001");
    Person p2 = new Person("Victoriia", "Vnuchkova", "Female", "06.05.2003");
    Person p3 = new Person("Mark", "Spasskih", "Male", "14.11.2033");
    Person p4 = new Person("Helly", "R", "Female", "04.12.1974");


    Tree tree = new Tree();
    tree.addRelation(p1, p2, Role.HUSBAND, Role.WIFE);
    tree.addRelation(p1, p3, Role.FATHER, Role.SON);
    tree.addRelation(p2, p3, Role.MOTHER, Role.SON);
    tree.addRelation(p4, p1, Role.MOTHER, Role.SON);


    // Research.printTree("Dmitriy", tree);
    // Research.printSex("Female", tree);
    // Research.printAllList(tree);
    Research.printChildren(tree);
  }
}
