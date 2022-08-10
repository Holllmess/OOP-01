import java.util.List;

public class Research implements Inter{

  public static void printTree(String name ,Tree tree){
    List<Relation> relations = tree.getTree();

    for (Relation rl : relations) {
      if(rl.getFirstPerson().getName().equals(name) &&
      rl.getRole() == Role.FATHER) {
        System.out.println(rl.getSecondPerson());
        System.out.println("Working..");
      } else {
        System.out.println("Something wrong.."); 
        break;
      }
      
    }
  }

  // public static void printSex(String sex, Tree tree){
  //   List<Relation> relations = tree.getTree();

  //   for (Relation relation : relations) {
  //     if(relation.getFirstPerson().getSex().equals(sex)){
  //       System.out.println(relation.getFirstPerson());
  //     }
  //   }
  // }

  public static void printAllList(Tree tree){
    List<Relation> relations = tree.getTree();

    System.out.println(relations);
  }

  public static void printChildren(Tree tree){
    List<Relation> relations = tree.getTree();

    for (Relation relation : relations) {
      if(relation.getRole() == Role.FATHER || relation.getRole() == Role.MOTHER){
        System.out.println(relation.getSecondPerson());
      }
    }
  }

  @Override
  public void printFathers(Tree tree) {
    List<Relation> relations = tree.getTree();

    for (Relation relation : relations) {
      if(relation.getRole() == Role.FATHER) System.out.println(relation.getFirstPerson());
    }
    
  }

}