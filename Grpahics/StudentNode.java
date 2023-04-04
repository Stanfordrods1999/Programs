import java.util.*;

class StudentNode{

  int id;
  String name;
  double cgpa;
  StudentNode left, right;

  public StudentNode(int id, String name, double cgpa){

    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
    this.left = this.right = null;
  }
}
