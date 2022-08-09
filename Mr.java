public class Mr extends Person {
  private String sex = "Male";

  public Mr(String n, String sn, String bd) {
    super(n, sn, bd);
  }
  
  public String getSex(){
    return sex;
  }
}
