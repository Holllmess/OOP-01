import java.util.ArrayList;
import java.util.List;

public class Tree {
  private List<Relation> relations = new ArrayList<>();

  public void addRelation(Person p1, Person p2, Role r1, Role r2){
    Relation relation01 = new Relation(p1, p2, r1);
    Relation relation02 = new Relation(p2, p1, r2);
    
    relations.add(relation01);
    relations.add(relation02);
  }

  public List<Relation> getTree(){  // возвращает наше дерево
    return relations;
  }
}
