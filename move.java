import java.util.ArrayList;
import java.util.List;

public class move {
  public static void main(String[] args) {
    // Person p1 = new Person("Dmitriy", "Spasskih", "Male", "23.06.2001");
    // Person p2 = new Person("Victoriia", "Vnuchkova", "Female", "06.05.2003");
    // Person p3 = new Person("Mark", "Spasskih", "Male", "14.11.2033");
    // Person p4 = new Person("Helly", "R", "Female", "04.12.1974");

    Mr p11 = new Mr("Erving", "S", 54); 
    Mr p22 = new Mr("Tony", "G", 69); 
    Ms p33 = new Ms("Vanda", "M", 32);
    Ms p44 = new Ms("Helly", "R", 28);
    Ms p55 = new Ms("Anna", "T", 38);


    // Tree tree = new Tree();
    // tree.addRelation(p1, p2, Role.HUSBAND, Role.WIFE);
    // tree.addRelation(p1, p3, Role.FATHER, Role.SON);
    // tree.addRelation(p2, p3, Role.MOTHER, Role.SON);
    // tree.addRelation(p4, p1, Role.MOTHER, Role.SON);

    Tree tree = new Tree();
    tree.addRelation(p11, p22, Role.FATHER, Role.SON);
    tree.addRelation(p33, p11, Role.DAUGHTER, Role.FATHER);
    tree.addRelation(p33, p22, Role.SISTER, Role.BROTHER);


    // Research.printTree("Dmitriy", tree);
    // Research.printSex("Female", tree);
    // Research.printAllList(tree);
    // Research.printChildren(tree);

    // Research.printAllList(tree);
    // Research.printChildren(tree);
    // System.out.println(p11.getSex());

    // Inter nn = new Research();
    // nn.printFathers(tree);

    List<Person> list = new ArrayList<>();
    list.add(p11);
    list.add(p22);
    list.add(p33);
    list.add(p44);
    list.add(p55);

    list.sort(new PersonComp());
    for (Person item : list) {
      System.out.println(item);
    }

    System.out.println("-----------------");

    list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    for (Person item : list) {
      System.out.println(item);
    }

  }
}
